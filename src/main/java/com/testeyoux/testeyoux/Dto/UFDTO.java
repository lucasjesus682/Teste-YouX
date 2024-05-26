package com.testeyoux.testeyoux.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UFDTO {
    private String sigla;

    public UFDTO(String sigla) {
        this.sigla = sigla;
    }
}