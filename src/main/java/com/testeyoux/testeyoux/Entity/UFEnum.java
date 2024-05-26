package com.testeyoux.testeyoux.Entity;

public enum UFEnum {
    AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO;

    public static UFEnum fromSigla(String sigla) {
        try {
            return UFEnum.valueOf(sigla);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Sigla inválida: " + sigla);
        }
    }
}
