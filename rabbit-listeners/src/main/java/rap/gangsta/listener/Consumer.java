package rap.gangsta.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import rap.gangsta.general.dto.ItemDto;

@Component
@RabbitListener(queues = "${spring.rabbitmq.template.default-receive-queue}")
public class Consumer {
    @RabbitHandler
    public void consumeMessageFromQueue(ItemDto orderStatus){
        System.out.println("Message recieved from queue : " + orderStatus);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
