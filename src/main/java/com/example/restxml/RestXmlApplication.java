package com.example.restxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RestXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestXmlApplication.class, args);
    }

}
