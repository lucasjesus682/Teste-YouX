package com.testeyoux.testeyoux.Entity;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "clients")
@Entity
@Data
public class Client {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    @Column(nullable = false)
    private String name;

    @Getter
    @Setter
    @Column(nullable = false)
    private String cnpj;

    @Getter
    @Setter
    @Column(nullable = false)
    private String email;

    @Getter
    @Setter
    @Column(nullable = false)
    private String tel;

    @Getter
    @Setter
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UFEnum uf;

    @Getter
    @Setter
    private String location;

    public Client(){

    }

    @Builder
    public Client(String name, String cnpj, String email, String tel, UFEnum ufId, String location) {
        this.name = name;
        this.cnpj = cnpj;
        this.email = email;
        this.tel = tel;
        this.uf = ufId;
        this.location = location;
    }
}
