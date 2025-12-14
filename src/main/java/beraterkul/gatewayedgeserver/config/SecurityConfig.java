package beraterkul.gatewayedgeserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain configure(ServerHttpSecurity httpSecurity){

        return httpSecurity
                .authorizeExchange()
                .pathMatchers("/actuator/**").permitAll() // Allow actuator endpoints (optional)
                .pathMatchers(HttpMethod.GET, "/webjars/**", "/swagger-ui.html", "/v3/api-docs/**").permitAll() // Allow Swagger UI resources
                .anyExchange().authenticated().and()
                .oauth2ResourceServer().jwt().and().and().build();
    }
}
