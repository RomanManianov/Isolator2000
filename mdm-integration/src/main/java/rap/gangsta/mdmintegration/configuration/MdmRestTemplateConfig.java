package rap.gangsta.mdmintegration.configuration;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.ExtractingResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.List;


@Configuration
public class MdmRestTemplateConfig {

    @Value("${http.timeout:300000}")
    int httpTimeOut;
    private final PoolingHttpClientConnectionManager httpClientConnectionPool;

    @Autowired
    public MdmRestTemplateConfig(PoolingHttpClientConnectionManager httpClientConnectionPool) {
        this.httpClientConnectionPool = httpClientConnectionPool;
    }

    @Bean
    @Qualifier("mdmRestTemplate")
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        // в restTemplate через внутрение конструкции по умолчанию используется HttpClients.createSystem,
        // поэтому в кастомном используем useSystemProperties, но устанавливаем свой пул соединений
        // p.s. для системного httpClient настройки пула по умолчанию были 5/10
        HttpClient httpClient = HttpClients.custom()
                .useSystemProperties()
                .setConnectionManager(httpClientConnectionPool)
                .build();

        // конфигурим timeout
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
        requestFactory.setConnectTimeout(httpTimeOut);
        requestFactory.setConnectionRequestTimeout(httpTimeOut);
        requestFactory.setReadTimeout(httpTimeOut);

        RestTemplate restTemplate = builder
                .errorHandler(new ExtractingResponseErrorHandler())
                .requestFactory(() -> requestFactory)
                .messageConverters(getGeneralMessageConverters())
                .build();

//        return new TraceRestTemplate(restTemplate); - TraceRestTemplate из закрытой библиотеки
        return restTemplate;
    }

    private List<HttpMessageConverter<?>> getGeneralMessageConverters(){
        List<HttpMessageConverter<?>> converters = new RestTemplate().getMessageConverters();
        converters.add(0, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        return converters;
    }
}
