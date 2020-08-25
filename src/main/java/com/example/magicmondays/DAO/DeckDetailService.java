package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Deck;
import com.example.magicmondays.Model.Player;
import com.example.magicmondays.Model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
public class DeckDetailService {

    @Autowired
    private IRecordRepository iRecordRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Deck deckDetails(int deck_id){
        return entityManager.find(Deck.class, deck_id);
    }

    public List<Record> deckRecordList(int deck_id){

        List<Record> fullRecordList = iRecordRepository.findAll();
        List<Record> recordList = new ArrayList<>();

        //Adds decks that are associated with the player to the deckList
        for(Record record: fullRecordList){
            if(record.getDeck_id_fk() == deck_id){
                recordList.add(record);
            }
        }

        return recordList;
    }

}
