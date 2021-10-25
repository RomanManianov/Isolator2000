package rap.gangsta.kafka.service;

import org.springframework.stereotype.Service;

@Service
public interface KafkaProducerService {

    void send(String topic, String message, String kafkaIdentifier) throws InterruptedException;
}
