package com.example.demoThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonneController {

    @GetMapping("hello")
    public String hello(){
        return "hello.html";
    }
}
