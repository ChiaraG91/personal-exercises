package com.eserciziospringboot2.eserciziospringboot2.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI myOpenApi(){
        Info info = new Info()
                .title("Esercizio")
                .version("1.0");

        return new OpenAPI().info(info);
    }
}
