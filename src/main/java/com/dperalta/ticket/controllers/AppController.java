package com.dperalta.ticket.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app")
public class AppController {
    @GetMapping("/holamundo")
    public String appTest(){
        return ("Hello World!");
    }
}
