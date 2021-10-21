package rap.gangsta.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("rap.gangsta")
public class AppLauncher {

    public static void main(String[] args) {
        SpringApplication.run(AppLauncher.class);
    }
}
