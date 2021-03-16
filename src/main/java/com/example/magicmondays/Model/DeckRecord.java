package com.example.magicmondays.Model;

import javax.persistence.*;

@Entity
public class DeckRecord {

    @EmbeddedId
    private DeckRecordKey deck_record_id;

    @ManyToOne
    @MapsId("deck_id")
    @JoinColumn(name = "deck_id")
    private Deck deck;

    @ManyToOne
    @MapsId("format_id")
    @JoinColumn(name = "format_id")
    private Format format;

    private int wins, losses;

    public DeckRecord() {
    }

}
