package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Deck;
import com.example.magicmondays.Model.Player;
import com.example.magicmondays.Model.Record;
import com.example.magicmondays.Model.Standings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class LeaderboardService {

    @Autowired
    private IPlayerRepository iPlayerRepository;

    @Autowired
    private IDeckRepository iDeckRepository;

    @Autowired
    private IRecordRepository iRecordRepository;

    public List<Standings> kothbo1Standing(){

        List<Standings> kothbo1Standing = findStanding("King of the Hill BO1");

        return kothbo1Standing;
    }

    public List<Standings> kothbo3Standing(){

        List<Standings> kothbo3Standing = findStanding("King of the Hill BO3");

        return kothbo3Standing;
    }

    public List<Standings> standardbo1Standing(){

        List<Standings> standardbo1Standing = findStanding("Standard BO1");

        return standardbo1Standing;
    }

    public List<Standings> standardbo3Standing(){

        List<Standings> standardbo3Standing = findStanding("Standard BO3");

        return standardbo3Standing;
    }

    public List<Standings> commanderStanding(){

        List<Standings> commanderStanding = findStanding("Commander");

        return commanderStanding;
    }

    public List<Standings> findStanding(String format){

        ArrayList<Standings> currentStandings = new ArrayList<>();

        List<Player> players = iPlayerRepository.findAll();
        List<Deck> decks = iDeckRepository.findAll();
        List<Record> records = iRecordRepository.findAll();

        //Goes over each players decks and adds up wins and losses based on format input value
        for(Player player: players){
            int wins = 0;
            int losses = 0;
            for(Deck deck: decks){
                if(deck.getPlayer_id_fk() == player.getPlayer_id()){
                    for(Record record: records){
                        if(record.getFormat().equals(format) && record.getDeck_id_fk() == deck.getDeck_id()){
                            wins = wins + record.getWins();
                            losses = losses + record.getLosses();
                        }
                    }
                }
            }
            currentStandings.add(new Standings(player.getPlayer_id(),player.getPlayer_name(),wins,losses,(wins-losses)));
        }

        // Sort based on format
        if(format.equals("Commander")){
            Collections.sort(currentStandings, (o1, o2) -> o2.getWins() - o1.getWins());
        } else {
            Collections.sort(currentStandings, (o1, o2) -> o2.getDifference() - o1.getDifference());
        }


        return currentStandings;
    }


}
