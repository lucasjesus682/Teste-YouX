package com.testeyoux.testeyoux.Dto.Response;

import com.testeyoux.testeyoux.Entity.Client;
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

    private Long ufId;

    private String location;

    public ClientResponseDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.cnpj = client.getCnpj();
        this.tel = client.getTel();
        this.email = client.getEmail();
        this.ufId = client.getUfId();
        this.location = client.getLocation();
    }
}
