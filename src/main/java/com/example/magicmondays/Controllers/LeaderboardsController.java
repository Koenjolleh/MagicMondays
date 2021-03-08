package com.example.magicmondays.Controllers;

import com.example.magicmondays.DAO.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeaderboardsController {

    @Autowired
    private LeaderboardService leaderboardService;

    @GetMapping("/kothbo1")
    public String kothbo1(Model model){

        model.addAttribute("kothbo1Standing",leaderboardService.kothbo1Standing());

        return "kothbo1";
    }

    @GetMapping("/kothbo3")
    public String kothbo3(Model model){

        model.addAttribute("kothbo3Standing",leaderboardService.kothbo3Standing());

        return "kothbo3";
    }

    @GetMapping("/standardbo1")
    public String standardbo1(Model model){

        model.addAttribute("standardbo1Standing",leaderboardService.standardbo1Standing());

        return "standardbo1";
    }

    @GetMapping("/standardbo3")
    public String standardbo3(Model model){

        model.addAttribute("standardbo3Standing",leaderboardService.standardbo3Standing());

        return "standardbo3";
    }

    @GetMapping("/commander")
    public String commander(Model model){

        model.addAttribute("commanderStanding",leaderboardService.commanderStanding());

        return "commander";
    }



}
