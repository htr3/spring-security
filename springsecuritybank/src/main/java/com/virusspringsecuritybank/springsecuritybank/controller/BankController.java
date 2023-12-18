package com.virusspringsecuritybank.springsecuritybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @GetMapping("/hello")
    public String sayWelcome() {
        return "this is the web application thank you for visiting";
    }
}
