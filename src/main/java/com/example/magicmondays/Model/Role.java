package com.example.magicmondays.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;

    @OneToMany(mappedBy = "role")
    private Set<AppUser> app_users = new HashSet<>();

    @Column(unique = true, nullable = false)
    private String role;

    public Role(){
    }

}
