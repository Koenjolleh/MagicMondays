package com.example.magicmondays.Controllers;

import com.example.magicmondays.DAO.PlayerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerDetailsController {

    @Autowired
    private PlayerDetailService playerDetailService;

    @GetMapping("/playerDetails")
    public String playerDetails(@RequestParam("player_id") int player_id, Model model){


        //Exception handling. Just do it.
        model.addAttribute("player", playerDetailService.playerDetails(player_id));
        model.addAttribute("deck_list", playerDetailService.playerDeckList(player_id));

        return "playerDetails";
    }


}
