package com.example.magicmondays.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class DeckType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deck_type_id;

    @OneToMany(mappedBy = "deck_type")
    private Set<Deck> decks = new HashSet<>();

    @Column(unique = true, nullable = false)
    private String deck_type;

    public DeckType() {
    }

}
