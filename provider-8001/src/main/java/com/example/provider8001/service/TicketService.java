package com.example.provider8001.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient(value = "PROVIDER-TICKET")
public class TicketService {

    public String getTicket(){
        return "8001的《星际穿越》";
    }
}
