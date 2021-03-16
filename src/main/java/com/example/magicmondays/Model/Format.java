package com.example.magicmondays.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Format {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long format_id;

    @OneToMany(mappedBy = "format")
    private Set<DeckRecord> deck_records = new HashSet<>();

    private String format;

    public Format() {
    }

}
