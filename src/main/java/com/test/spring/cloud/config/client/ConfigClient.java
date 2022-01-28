package com.test.spring.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@RestController
public class ConfigClient {


    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }


}
