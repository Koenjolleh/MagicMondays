package com.example.magicmondays.Model;

public class Standings {

    private int player_id;
    private String player_name;
    private int wins;
    private int losses;
    private int difference;

    public Standings() {
    }

    public Standings(int player_id, String player_name, int wins, int losses, int difference) {
        this.player_id = player_id;
        this.player_name = player_name;
        this.wins = wins;
        this.losses = losses;
        this.difference = difference;
    }


}
