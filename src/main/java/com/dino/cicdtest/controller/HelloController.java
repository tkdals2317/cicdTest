package com.dino.cicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Dino!";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye, Dino!";
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Greetings, Dino!";
    }
}
