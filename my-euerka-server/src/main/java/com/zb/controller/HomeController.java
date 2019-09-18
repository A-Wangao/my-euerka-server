package com.zb.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    public String index(){
        return "hello";
    }
}
