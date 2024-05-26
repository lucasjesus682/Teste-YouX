package com.testeyoux.testeyoux.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
public class UF {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ElementCollection(targetClass = UFEnum.class)
    @Enumerated(EnumType.STRING)
    private String sigla;

    public UF (){
    }

    public UF(String nome, String sigla){
        this.nome = getNome();
        this.sigla = getSigla();
    }

    public UF(String sigla) {
    }
}
