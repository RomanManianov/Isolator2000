package rap.gangsta.rabbit.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rap.gangsta.general.dto.ItemDto;
import rap.gangsta.rabbit.dto.OrderStatus;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody ItemDto itemDto, @PathVariable String restaurantName) {
        itemDto.setOrderId(UUID.randomUUID().toString());
        OrderStatus orderStatus = new OrderStatus(itemDto, "PROCESS", "order placed successfully in "
                + restaurantName);
        for (int i = 0; i < 3; i++) {
            template.convertAndSend("${spring.rabbitmq.template.exchange}",
                    "${spring.rabbitmq.template.routing-key}",
                    orderStatus);
        }
        return "Success";
    }
}
