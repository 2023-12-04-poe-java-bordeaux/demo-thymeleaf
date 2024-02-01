package com.example.demoThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonneController {

    @GetMapping("hello")
    public String hello(Model model){

        String prenom = "Jean-Christophe";
        model.addAttribute("prenom",prenom);

        return "hello.html";
    }
}
