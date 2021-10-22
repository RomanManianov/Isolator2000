package rap.gangsta.rabbit.service;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rap.gangsta.general.dto.ItemDto;
import rap.gangsta.rabbit.configuration.RabbitSender;

@Service
public class RabbitSenderImpl implements RabbitSender {

    private final RabbitTemplate rabbit;

    private final Exchange exchange;

    @Autowired
    public RabbitSenderImpl(RabbitTemplate rabbit, Exchange exchange) {
        this.rabbit = rabbit;
        this.exchange = exchange;
    }

    @Override
    public void sendMessage(ItemDto message, String queueKey) {
        rabbit.convertAndSend(exchange.getName(), queueKey,message);
    }
}
