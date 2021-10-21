package rap.gangsta.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import rap.gangsta.mdmintegration.configuration.MdmPaths;

@SpringBootApplication
@ComponentScan("rap.gangsta")
public class AppLauncher {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AppLauncher.class);
    }
}
