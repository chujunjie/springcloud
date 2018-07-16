package com.example.providerhystrix8004.controller;


import com.example.providerhystrix8004.service.TicketServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketServiceImpl ticketService;

    @GetMapping("/ticket")
    @HystrixCommand(fallbackMethod = "hello")
    public String getTicket(){
        if (true){
            throw new RuntimeException("该id没有购买权限");
        }
        return ticketService.getTicket();
    }

    public String hello(){
        return "该id没有购买权限";
    }

}
