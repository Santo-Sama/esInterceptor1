package com.example.esInterceptor1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    @GetMapping
    public String oldCode(){
        return "this is just old code";
    }
}
