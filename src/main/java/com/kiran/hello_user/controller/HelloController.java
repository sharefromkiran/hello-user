package com.kiran.hello_user.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{username}")
    public String hello(@PathVariable String username) {
        return "Hello, " + username + "!";
    }
}
