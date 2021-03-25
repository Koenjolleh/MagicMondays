package com.example.magicmondays.Model;

import javax.persistence.*;

@Entity
public class MatchType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long match_type_id;

    @Column(unique = true, nullable = false)
    private String match_type;

    public MatchType() {
    }

}
