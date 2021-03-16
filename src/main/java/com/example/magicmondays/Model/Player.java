package com.example.magicmondays.Model;

import javax.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long player_id;

    private String player_name;

    public Player() {
    }

}
