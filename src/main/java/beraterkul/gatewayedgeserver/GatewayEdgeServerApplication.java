package beraterkul.gatewayedgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class GatewayEdgeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayEdgeServerApplication.class, args);
    }

}
