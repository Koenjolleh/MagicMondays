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

    @OneToMany(mappedBy = "format")
    private Set<Match> matches = new HashSet<>();

    @Column(unique = true, nullable = false)
    private String format;

    public Format() {
    }

    @Override
    public String toString() {
        return "Format{" +
                "format_id=" + format_id +
                ", deck_records=" + deck_records +
                ", format='" + format + '\'' +
                '}';
    }

}
