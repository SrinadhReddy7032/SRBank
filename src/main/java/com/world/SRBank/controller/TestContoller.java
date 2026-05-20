package com.world.SRBank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestContoller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Jenkins";
    }

    @GetMapping("/getCustomer")
    public String getCustomer() {
        return "Hello Srinadh Reddy";
    }
}
