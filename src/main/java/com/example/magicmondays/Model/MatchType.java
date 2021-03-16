package com.example.magicmondays.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MatchType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long match_type_id;

    private String match_type;

    public MatchType() {
    }

}
