package com.example.magicmondays.Model;

import javax.persistence.*;

@Entity
public class DeckColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deck_color_id;

    @Column(unique = true, nullable = false)
    private String deck_color;

    public DeckColor() {
    }

}
