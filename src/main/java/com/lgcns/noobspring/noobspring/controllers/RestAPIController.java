package com.lgcns.noobspring.noobspring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

    @RequestMapping("/rest")
    public String hello() {
        return "Hello, World!";
    }
}
