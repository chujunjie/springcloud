package com.example.provider8002.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient(value = "PROVIDER-TICKET")
public class TicketService {

    public String getTicket(){
        return "8002的《我不是药神》";
    }
}
