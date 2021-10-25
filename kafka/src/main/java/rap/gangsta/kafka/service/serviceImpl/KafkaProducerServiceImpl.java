package rap.gangsta.kafka.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import rap.gangsta.kafka.configuration.KafkaConfig;
import rap.gangsta.kafka.exception.CustomMessageException;
import rap.gangsta.kafka.service.KafkaProducerService;

import java.util.UUID;
import java.util.concurrent.Future;

@Service
@Slf4j
public class KafkaProducerServiceImpl implements KafkaProducerService {

    @Autowired
    KafkaConfig kafkaConfig;

    @Value("${kafka.attempt-count}")
    private Integer kafkaAttemptCount;

    @Value("${kafka.duration-millis}")
    private Long kafkaCheckDurationMillis;

    @Override
    public void send(String topic, String message, String kafkaIdentifier) throws InterruptedException {
        KafkaProducer<String, String> producer = kafkaConfig.getProducer(kafkaIdentifier);
        ProducerRecord<String, String> record = new ProducerRecord<>(topic, UUID.randomUUID().toString(), message);

        for (int i = 0; i < kafkaAttemptCount; i++) {
            Future<RecordMetadata> response = producer.send(record);

            try {
                response.get();
                log.info("Сообщение успешно отправлено. KafkaIdentifier:"
                        + kafkaIdentifier + " topic:" + topic + " message:" + message);
                break;
            } catch (Exception e) {
                log.error("Во время отправки сообщения в Kafka произошла ошибка (попытка "
                        + (i+1) + " из " + kafkaAttemptCount + ")", e);

                if ( i == kafkaAttemptCount - 1) {
                    throw new CustomMessageException("Во время отправки сообщения произошла ошибка: " + e.getMessage());
                } else {
                    Thread.sleep(kafkaCheckDurationMillis);
                }
            }
        }
    }
}
