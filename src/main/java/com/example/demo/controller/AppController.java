package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    //@RequestMapping("/getVersion")
    @GetMapping("/getVersion")
    public String getAppVersion() throws Exception {
        return "0.0.1";
    }
}