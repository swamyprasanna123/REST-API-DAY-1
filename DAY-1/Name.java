package com.example.demo.day1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
    @RequestMapping("/Name")
    public String getName() {
        return "Welcome Demo!";
    }
}