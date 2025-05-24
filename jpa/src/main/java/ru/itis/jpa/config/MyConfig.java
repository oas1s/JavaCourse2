package ru.itis.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class MyConfig {


    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl("https://www.thecocktaildb.com/api/json/v1/1").build();
    }
}
