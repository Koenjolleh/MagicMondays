package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.AppUser;
import com.example.magicmondays.Model.Deck;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class PlayerDetailService {


    @PersistenceContext
    private  EntityManager entityManager;


    public AppUser playerDetails(int app_user_id){

        return entityManager.find(AppUser.class, app_user_id);
    }

    public List<Deck> playerDeckList(int player_id){

        Query q = entityManager.createNativeQuery("SELECT * FROM magic_schema.deck WHERE player_id_fk = :player_id", Deck.class);
        q.setParameter("player_id", player_id);

        return q.getResultList();
    }


}
