package com.example.magicmondays.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeaderboardsController {

    @GetMapping("/kothbo1")
    public String kothbo1(){
        return "kothbo1";
    }

    @GetMapping("/kothbo3")
    public String kothbo3(){
        return "kothbo3";
    }

    @GetMapping("/standardbo1")
    public String standardbo1(){
        return "standardbo1";
    }

    @GetMapping("/standardbo3")
    public String standardbo3(){
        return "standardbo3";
    }

    @GetMapping("/commander")
    public String commander(){
        return "commander";
    }



}
