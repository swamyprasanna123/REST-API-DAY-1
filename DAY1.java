package com.example.demo.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DAY1{
    @GetMapping("/")
    public String getMyFav(){
        String yourFavColor="Green";
        return "My favorite color is "+yourFavColor;
    }

}