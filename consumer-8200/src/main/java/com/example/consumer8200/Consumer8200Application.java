package com.example.consumer8200;

import com.example.consumer8200.utils.MyRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient //开启发现服务功能
@SpringBootApplication
//@RibbonClient(name = "PROVIDER-TICKET",configuration = MyRule.class)
public class Consumer8200Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer8200Application.class, args);
    }

    @LoadBalanced //启用负载均衡,默认为轮询方式
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
//        return new RandomRule();
//    }

}
