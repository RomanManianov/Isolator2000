package rap.gangsta.mdmintegration.configuration;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PoolingHttpClientConnectionManagerConfig {

    @Value("${http.maxConnectionsPerRoute:10}")
    int httpMaxConnectionsPerRoute;

    @Value("${http.maxConnectionsTotal:50}")
    int httpMaxConnectionsTotal;

    /**
     * @apiNote пул соединений один для всех RestTemplate
     */

    @Bean
    PoolingHttpClientConnectionManager poolingHttpClientConnectionManager() {
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
        connectionManager.setMaxTotal(httpMaxConnectionsTotal);
        connectionManager.setDefaultMaxPerRoute(httpMaxConnectionsPerRoute);
        return connectionManager;
    }

}