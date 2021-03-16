package com.example.magicmondays.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeckType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deck_type_id;

    private String deck_type;

    public DeckType() {
    }

}
