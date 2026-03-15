package com.onepieceofjava.Springboot_Anthony_Magpantay.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/anthony")
    public String getMessage(){
        return "Hi Anthony, Welcome to Springboot";
    }
}
