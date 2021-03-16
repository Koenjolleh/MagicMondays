package com.example.magicmondays.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeckColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deck_color_id;

    private String deck_color;

    public DeckColor() {
    }

}
