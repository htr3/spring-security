package com.virusspringsecuritybank.springsecuritybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loansController {

    @GetMapping("/myLoan")
    public String getAccountDetails() {
        return "Here are the loan details from DB";
    }
}
