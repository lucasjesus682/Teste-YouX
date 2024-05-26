package com.testeyoux.testeyoux.Dto.Request;

import com.testeyoux.testeyoux.Entity.UFEnum;
import lombok.Getter;

@Getter
public class ClientRequestDTO {

    private String name;

    private String cnpj;

    private String email;

    private String tel;

    private UFEnum uf;

    private String location;

}
