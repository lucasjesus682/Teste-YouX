package com.testeyoux.testeyoux.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Erole username;

    public Role(){

    }

    public Role(Erole username){
        this.username = username;
    }
}
