package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Deck;
import com.example.magicmondays.Model.DeckRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class DeckDetailService {

    @Autowired
    private IDeckRepository iDeckRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Deck deckDetails(int deck_id){
        return entityManager.find(Deck.class, deck_id);
    }

    public List<DeckRecord> deckRecordList(int deck_id){

        Query q = entityManager.createNativeQuery("SELECT * FROM magic_schema.record WHERE deck_id_fk = :deck_id", DeckRecord.class);
        q.setParameter("deck_id", deck_id);

        return q.getResultList();
    }

}
