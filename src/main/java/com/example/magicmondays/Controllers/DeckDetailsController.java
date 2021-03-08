package com.example.magicmondays.Controllers;

import com.example.magicmondays.DAO.DeckDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeckDetailsController {

    @Autowired
    private DeckDetailService deckDetailService;

    @GetMapping("/deckDetails")
    public String deckDetails(@RequestParam("deck_id") int deck_id, Model model){

        model.addAttribute("deck", deckDetailService.deckDetails(deck_id));
        model.addAttribute("record_list", deckDetailService.deckRecordList(deck_id));

        return "deckDetails";
    }

}
