package com.example.provider8003.controller;


import com.example.provider8003.service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketServiceImpl ticketService;

    @GetMapping("/ticket")
    public String getTicket(){

        return ticketService.getTicket();
    }

}
