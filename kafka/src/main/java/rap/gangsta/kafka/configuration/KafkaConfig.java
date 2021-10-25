package rap.gangsta.kafka.configuration;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import rap.gangsta.kafka.exception.CustomMessageException;

import java.util.Properties;

@Component
public class KafkaConfig {

    @Autowired
    private Environment environment;

    public  <K, V> KafkaProducer<K, V> getProducer(String kafkaIdentifier) {
        Properties properties = new Properties();
        String bootstrapServers = environment.getProperty("kafka." + kafkaIdentifier + ".bootstrap-servers");
        if (StringUtils.isEmpty(bootstrapServers)) {
            throw new CustomMessageException("Ну удалось найти конфигурацию для Kafka с идентификатором" + kafkaIdentifier);
        }

        properties.put("bootstrap.servers", bootstrapServers);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        return new KafkaProducer<>(properties);
    }
}
