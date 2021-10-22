package rap.gangsta.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("rap.gangsta")
public class AppLauncher {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AppLauncher.class);
    }
}
