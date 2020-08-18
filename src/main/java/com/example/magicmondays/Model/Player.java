package com.example.magicmondays.Model;

import javax.persistence.*;

@Entity
@Table(name = "player", schema = "magic_schema")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id;

    private String player_name;

    public Player(int player_id, String player_name) {
        this.player_id = player_id;
        this.player_name = player_name;
    }

    public Player() {

    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }
}
