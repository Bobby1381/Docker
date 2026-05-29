package com.RestDemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {
    @RequestMapping("/")

    public String get(){
        return "Docker hello ";
    }
}
