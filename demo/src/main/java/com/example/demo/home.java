package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Generated;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class home {
    
    @GetMapping("/")
    public String home(){
        return "<h1>Welcome</h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1>Hello user</h1>";
    } 

    @GetMapping("/admin")
    public String admin() {
        return "<h1>Hello admin</h1>";
    }
    
}
