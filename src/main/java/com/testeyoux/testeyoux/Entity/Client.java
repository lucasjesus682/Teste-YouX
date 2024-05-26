package com.testeyoux.testeyoux.Entity;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
    private Long ufId;

    @Getter
    @Setter
    private String location;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(  name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public Client(){

    }

    @Builder
    public Client(String name, String cnpj, String email, String tel, Long ufId, String location) {
        this.name = name;
        this.cnpj = cnpj;
        this.email = email;
        this.tel = tel;
        this.ufId = ufId;
        this.location = location;
    }
}
