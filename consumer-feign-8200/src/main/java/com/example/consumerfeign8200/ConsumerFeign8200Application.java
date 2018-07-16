package com.example.consumerfeign8200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerFeign8200Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign8200Application.class, args);
    }
}
