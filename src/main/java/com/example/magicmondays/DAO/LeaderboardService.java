package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Deck;
import com.example.magicmondays.Model.DeckRecord;
import com.example.magicmondays.Model.Standings;
//import com.example.magicmondays.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
public class LeaderboardService {

    @Autowired
    private IAppUserRepository iAppUserRepository;

    @Autowired
    private IDeckRepository iDeckRepository;

    @Autowired
    private IDeckRecordRepository iDeckRecordRepository;

    @PersistenceContext
    private EntityManager entityManager;

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

//        something like this, need to figure out how to do the sub quearies, maybe too much of a hassle
//        entityManager.createQuery("SELECT new Standings(a.player_id, a.player_name, )",Standings.class);

        ArrayList<Standings> currentStandings = new ArrayList<>();
//
//        List<LorteUser> users = iPlayerRepository.findAll();
//        List<Deck> decks = iDeckRepository.findAll();
//        List<DeckRecord> records = iDeckRecordRepository.findAll();

        //Goes over each players decks and adds up wins and losses based on format input value
//        for(Player player: players){
//            int wins = 0;
//            int losses = 0;
//            for(Deck deck: decks){
//                if(deck.getPlayer_id() == player.getPlayer_id()){
//                    for(DeckRecord deckRecord : records){
//                        if(deckRecord.getFormat_id().equals(format) && deckRecord.getDeck_id_fk() == deck.getDeck_id()){
//                            wins = wins + deckRecord.getWins();
//                            losses = losses + deckRecord.getLosses();
//                        }
//                    }
//                }
//            }
//            currentStandings.add(new Standings(player.getPlayer_id(),player.getPlayer_name(),wins,losses,(wins-losses)));
//        }

        // Sort based on format
//        if(format.equals("Commander")){
//            // Sort based on wins
//            Collections.sort(currentStandings, (o1, o2) -> o2.getWins() - o1.getWins());
//        } else {
//            // Sort based on wins minus losses
//            Collections.sort(currentStandings, (o1, o2) -> o2.getDifference() - o1.getDifference());
//        }


        return currentStandings;
    }


}
