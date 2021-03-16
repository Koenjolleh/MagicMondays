package com.example.magicmondays.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long match_id;

    @ManyToOne
    @JoinColumn(name = "format_id")
    private Format format;

    @ManyToOne
    @JoinColumn(name = "match_type_id")
    private MatchType match_type;

    @ManyToMany
    @JoinTable(
            name = "match_decks",
            joinColumns = {@JoinColumn(name = "match_id")},
            inverseJoinColumns = {@JoinColumn(name = "deck_id")}
    )
    Set<Deck> decks = new HashSet<>();

    private int winner_id;

    public Match() {
    }

}
