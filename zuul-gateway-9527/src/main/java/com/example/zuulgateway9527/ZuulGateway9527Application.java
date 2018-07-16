package com.example.zuulgateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.http.codec.support.DefaultServerCodecConfigurer;
import org.springframework.web.reactive.DispatcherHandler;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway9527Application.class, args);
    }

    @Bean
    public DispatcherHandler dispatcherHandler(){
        return new DispatcherHandler();
    }

    @Bean
    public DefaultServerCodecConfigurer serverCodecConfigurer(){
        return new DefaultServerCodecConfigurer();
    }
}
