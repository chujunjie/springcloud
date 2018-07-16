package com.example.consumerfeign8200.controller;

import com.example.publicapi.service.TicketClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private TicketClientService ticketClientService;

    @GetMapping(value = "/buy")
    public String buyTicket(String name){
        return ticketClientService.getTicket(name);
    }

}
