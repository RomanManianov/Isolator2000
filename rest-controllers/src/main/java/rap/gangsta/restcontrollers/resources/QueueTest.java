package rap.gangsta.restcontrollers.resources;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api
@RequestMapping("/api/queue/url")
public interface QueueTest {


    @PostMapping("/sendQueue")
    void sendQueue();

}
