package com.example.magicmondays.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MatchType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long match_type_id;

    @OneToMany(mappedBy = "match_type")
    private Set<Match> matches = new HashSet<>();

    @Column(unique = true, nullable = false)
    private String match_type;

    public MatchType() {
    }

}
