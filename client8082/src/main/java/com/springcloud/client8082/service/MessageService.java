package com.springcloud.client8082.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageService {
    @Autowired
    private RestTemplate restTemplate;
   @GetMapping("/message")
    public String getMessage(){
       String response= restTemplate.getForObject("http://SERVER8083/message",String.class);
       return response;
    }

}
