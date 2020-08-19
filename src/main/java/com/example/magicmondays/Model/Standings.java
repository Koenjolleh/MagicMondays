package com.example.magicmondays.Model;

public class Standings {

    private int player_id;
    private String player_name;
    private int wins;
    private int losses;
    private int difference;

    public Standings(int player_id, String player_name, int wins, int losses, int difference) {
        this.player_id = player_id;
        this.player_name = player_name;
        this.wins = wins;
        this.losses = losses;
        this.difference = difference;
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

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }
}
