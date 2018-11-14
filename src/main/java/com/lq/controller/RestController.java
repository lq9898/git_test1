package com.lq.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("Test")
public class RestController {
    @RequestMapping("first")
    public String  first(){
        System.out.println("this is first project");
        return "this is first project";
    }
}
