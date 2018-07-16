package com.example.eurekaserver8762;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer8762Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8762Application.class, args);
    }
}
