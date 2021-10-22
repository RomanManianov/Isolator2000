package rap.gangsta.restcontrollers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import rap.gangsta.general.dto.ItemDto;
import rap.gangsta.general.ifaces.broker.BrokerSender;
import rap.gangsta.restcontrollers.resources.QueueTest;

@RestController
public class QueueController implements QueueTest {
    @Autowired
    private BrokerSender brokerSender;

    @Value("${spring.rabbitmq.template.routing-key}")
    private String queueKeyTest;
    @Override
    public void sendQueue() {
        brokerSender.sendMessage(new ItemDto("1","2"),queueKeyTest);
    }
}
