package com.example.magicmondays.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class DeckColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deck_color_id;

    @OneToMany(mappedBy = "deck_color")
    private Set<Deck> decks = new HashSet<>();

    @Column(unique = true, nullable = false)
    private String deck_color;

    public DeckColor() {
    }

}
