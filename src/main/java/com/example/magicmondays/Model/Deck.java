package com.example.magicmondays.Model;

import javax.persistence.*;

@Entity
@Table(name = "deck", schema = "magic_schema")
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deck_id;

    private String deck_name;
    private String deck_colors;
    private int player_id_fk;

    public Deck(int deck_id, String deck_name, String deck_colors, int player_id_fk) {
        this.deck_id = deck_id;
        this.deck_name = deck_name;
        this.deck_colors = deck_colors;
        this.player_id_fk = player_id_fk;
    }

    public Deck() {

    }

    public int getDeck_id() {
        return deck_id;
    }

    public void setDeck_id(int deck_id) {
        this.deck_id = deck_id;
    }

    public String getDeck_name() {
        return deck_name;
    }

    public void setDeck_name(String deck_name) {
        this.deck_name = deck_name;
    }

    public String getDeck_colors() {
        return deck_colors;
    }

    public void setDeck_colors(String deck_colors) {
        this.deck_colors = deck_colors;
    }

    public int getPlayer_id_fk() {
        return player_id_fk;
    }

    public void setPlayer_id_fk(int player_id_fk) {
        this.player_id_fk = player_id_fk;
    }
}
