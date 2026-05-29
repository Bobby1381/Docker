package com.RestDemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DemoController {
    @RequestMapping("/")

    public String get(){
        return "Docker hello ";
    }
}
