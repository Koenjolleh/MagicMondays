package com.example.magicmondays.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/deckBuilder")
    public String deckBuilder(){
        return "deckBuilder";
    }

}
