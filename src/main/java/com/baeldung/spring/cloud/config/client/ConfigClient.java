package com.baeldung.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.HttpsURLConnection;
import java.util.Properties;

@SpringBootApplication
@Configuration
@RestController
public class ConfigClient {


    public static void main(String[] args) {
        java.security.Security.setProperty("networkaddress.cache.negative.ttl", "0");
        Properties systemProps = System.getProperties();
        systemProps.put("javax.net.ssl.trustStore", "/Users/rpardo/Proyectos/parent/odin-service/server.jks");
        systemProps.put("javax.net.ssl.trustStorePassword", "storePassword");
        System.setProperties(systemProps);
        HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
        SpringApplication.run(ConfigClient.class, args);


    }


}
