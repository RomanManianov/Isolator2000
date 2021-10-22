package rap.gangsta.general.ifaces.broker;

import org.springframework.stereotype.Component;
import rap.gangsta.general.dto.ItemDto;


public interface BrokerSender {

    void sendMessage(ItemDto message, String queueKey) ;
}
