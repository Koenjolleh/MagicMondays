package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Deck;
import com.example.magicmondays.Model.Player;
import com.example.magicmondays.Model.Record;
import com.example.magicmondays.Model.Standings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeaderboardService {

    @Autowired
    private IPlayerRepository iPlayerRepository;

    @Autowired
    private IDeckRepository iDeckRepository;

    @Autowired
    private IRecordRepository iRecordRepository;

    public List<Standings> commanderStanding(){

        ArrayList<Standings> currentStandings = new ArrayList<>();

        List<Player> players = iPlayerRepository.findAll();
        List<Deck> decks = iDeckRepository.findAll();
        List<Record> records = iRecordRepository.findAll();


        return currentStandings;
    }

}
