package com.example.magicmondays.Model;

import javax.persistence.*;

@Entity
public class DeckRecord {

    @EmbeddedId
    private DeckRecordKey deck_record_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("deck_id")
    @JoinColumn(name = "deck_id")
    private Deck deck;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("format_id")
    @JoinColumn(name = "format_id")
    private Format format;

    private int wins, losses;

    public DeckRecord() {
    }

    @Override
    public String toString() {
        return "DeckRecord{" +
                "deck_record_id=" + deck_record_id +
                ", deck=" + deck +
                ", format=" + format +
                ", wins=" + wins +
                ", losses=" + losses +
                '}';
    }
}
