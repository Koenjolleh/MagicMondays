package com.example.magicmondays.Model;

import javax.persistence.*;

@Entity
public class DeckType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deck_type_id;

    @Column(unique = true, nullable = false)
    private String deck_type;

    public DeckType() {
    }

}
