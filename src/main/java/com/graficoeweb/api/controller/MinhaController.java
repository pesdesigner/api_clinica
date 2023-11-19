package com.graficoeweb.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MinhaController {

    @GetMapping
    public String hello(){
        return "Hello Mundo 2";
    }
}
