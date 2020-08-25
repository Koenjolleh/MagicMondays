package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Deck;
import com.example.magicmondays.Model.Player;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerDetailService {


    @Autowired
    private IDeckRepository iDeckRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Player playerDetails(int player_id){
        return entityManager.find(Player.class, player_id);
    }

    public List<Deck> playerDeckList(int player_id){

        List<Deck> fullDeckList = iDeckRepository.findAll();
        List<Deck> deckList = new ArrayList<>();

        //Adds decks that are associated with the player to the deckList
        for(Deck deck: fullDeckList){
            if(deck.getPlayer_id_fk() == player_id){
                deckList.add(deck);
            }
        }

        return deckList;
    }


}
