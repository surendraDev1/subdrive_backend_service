package com.example.subdrive.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/hello")
public class testController {

    @GetMapping
    public String sayHello() {
        return "Hello, Welcome to Sub Rentals!";
    }
}
