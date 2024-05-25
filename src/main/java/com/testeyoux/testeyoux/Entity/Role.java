package com.testeyoux.testeyoux.Entity;

import javax.persistence.*;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Erole getUsername() {
        return username;
    }

    public void setName(Erole username){
        this.username = username;
    }
}
