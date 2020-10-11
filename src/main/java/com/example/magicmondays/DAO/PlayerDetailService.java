package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Deck;
import com.example.magicmondays.Model.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerDetailService {


    @PersistenceContext
    private  EntityManager entityManager;


    public Player playerDetails(int player_id){

        return entityManager.find(Player.class, player_id);
    }

    public List<Deck> playerDeckList(int player_id){

        Query q = entityManager.createNativeQuery("SELECT * FROM magic_schema.deck WHERE player_id_fk = :player_id", Deck.class);
        q.setParameter("player_id", player_id);

        return q.getResultList();
    }


}
