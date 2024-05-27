package com.mervecelik.SpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/index")
    public String index(){
        return "index sayfası:user";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard sayfası:admin";

    }
}
