package com.example.magicmondays.Model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DeckRecordKey implements Serializable {

    private Long deck_id;
    private Long format_id;

    public DeckRecordKey() {
    }

    public DeckRecordKey(Long deck_id, Long format_id) {
        super();
        this.deck_id = deck_id;
        this.format_id = format_id;
    }

    public Long getDeck_id() {
        return deck_id;
    }

    public void setDeck_id(Long deck_id) {
        this.deck_id = deck_id;
    }

    public Long getFormat_id() {
        return format_id;
    }

    public void setFormat_id(Long format_id) {
        this.format_id = format_id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((deck_id == null) ? 0 : deck_id.hashCode());
        result = prime * result
                + ((format_id == null) ? 0 : format_id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DeckRecordKey other = (DeckRecordKey) obj;
        return Objects.equals(getDeck_id(), other.getDeck_id()) && Objects.equals(getFormat_id(), other.getFormat_id());
    }
}
