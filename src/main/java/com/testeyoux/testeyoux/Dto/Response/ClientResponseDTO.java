package com.testeyoux.testeyoux.Dto.Response;

import com.testeyoux.testeyoux.Entity.Client;
import com.testeyoux.testeyoux.Entity.UFEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientResponseDTO {
    private Long id;

    private String name;

    private String cnpj;

    private String tel;

    private String email;

    private UFEnum uf;

    private String location;

    public ClientResponseDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.cnpj = client.getCnpj();
        this.tel = client.getTel();
        this.email = client.getEmail();
        this.uf = client.getUf();
        this.location = client.getLocation();
    }
}
