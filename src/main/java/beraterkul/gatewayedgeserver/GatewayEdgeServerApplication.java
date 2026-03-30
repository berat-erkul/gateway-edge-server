package beraterkul.gatewayedgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayEdgeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayEdgeServerApplication.class, args);
    }

}



/*

    export JAVA_HOME=/Users/beraterkul/Library/Java/JavaVirtualMachines/corretto-11.0.30/Contents/Home
    irun

 */