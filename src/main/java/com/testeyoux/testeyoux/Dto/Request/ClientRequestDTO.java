package com.testeyoux.testeyoux.Dto.Request;

import lombok.Getter;

@Getter
public class ClientRequestDTO {

    private String name;

    private String cnpj;

    private String email;

    private String tel;

    private Long ufId;

    private String location;
}
