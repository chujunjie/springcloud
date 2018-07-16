package com.example.consumerhystrixdashboard9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启HystrixDashboard监控
public class ConsumerHystrixDashboard9001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboard9001Application.class, args);
    }
}
