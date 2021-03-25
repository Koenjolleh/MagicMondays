package com.example.magicmondays.Model;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;

    @Column(unique = true, nullable = false)
    private String role;

    public Role(){
    }

}
