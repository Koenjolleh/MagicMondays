package com.example.magicmondays.Model;

import javax.persistence.*;

@Entity
@Table(name = "record", schema = "magic_schema")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int record_id;

    private String format;
    private int wins;
    private int losses;
    private int deck_id_fk;

    public Record(int record_id, String format, int wins, int losses, int deck_id_fk) {
        this.record_id = record_id;
        this.format = format;
        this.wins = wins;
        this.losses = losses;
        this.deck_id_fk = deck_id_fk;
    }

    public Record() {

    }

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDeck_id_fk() {
        return deck_id_fk;
    }

    public void setDeck_id_fk(int deck_id_fk) {
        this.deck_id_fk = deck_id_fk;
    }
}
