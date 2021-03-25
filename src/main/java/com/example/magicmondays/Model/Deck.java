package com.example.magicmondays.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deck_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_user_id", nullable = false)
    private AppUser appUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deck_color_id", nullable = false)
    private DeckColor deck_color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deck_type_id", nullable = false)
    private DeckType deck_type;

    @OneToMany(mappedBy = "deck")
    private Set<DeckRecord> deck_records = new HashSet<>();

    @ManyToMany(mappedBy = "decks")
    private Set<Match> matches = new HashSet<>();

    private String deck_name;

    public Deck() {
    }

}
