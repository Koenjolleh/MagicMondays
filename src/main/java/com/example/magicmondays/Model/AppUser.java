package com.example.magicmondays.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long app_user_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @OneToMany(mappedBy = "app_user")
    private Set<Deck> decks = new HashSet<>();

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public AppUser() {
    }

}
