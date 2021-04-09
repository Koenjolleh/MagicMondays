package com.example.magicmondays.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long match_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "format_id", nullable = false)
    private Format format;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_type_id", nullable = false)
    private MatchType match_type;

    @ManyToMany
    @JoinTable(
            name = "match_decks",
            joinColumns = {@JoinColumn(name = "match_id")},
            inverseJoinColumns = {@JoinColumn(name = "deck_id")}
    )
    Set<Deck> decks = new HashSet<>();

    @Column(nullable = false)
    private Long winner_id;

    private LocalDate date_of_match;

    public Match() {
    }

    @Override
    public String toString() {
        return "Match{" +
                "match_id=" + match_id +
                ", format=" + format +
                ", match_type=" + match_type +
                ", decks=" + decks +
                ", winner_id=" + winner_id +
                ", date_of_match=" + date_of_match +
                '}';
    }
}
