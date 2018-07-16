package com.example.publicapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(value = "XIXI")
public interface TicketClientService {
    @RequestMapping(value = "/buy",method = RequestMethod.GET)
    String getTicket(String name);

}
