package com.testeyoux.testeyoux.Util;

import com.testeyoux.testeyoux.Dto.Request.ClientRequestDTO;
import com.testeyoux.testeyoux.Dto.Response.ClientResponseDTO;
import com.testeyoux.testeyoux.Entity.Client;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClientMapper {
    public Client toClient(ClientRequestDTO clientDTO){
        return Client.builder()
                .name(clientDTO.getName())
                .cnpj(clientDTO.getCnpj())
                .email(clientDTO.getEmail())
                .tel(clientDTO.getTel())
                .ufId(clientDTO.getUf())
                .location(clientDTO.getLocation())
                .build();
    }

    public ClientResponseDTO toClientDTO(Client client){
        return new ClientResponseDTO(client);
    }

    public List<ClientResponseDTO> toPeopleDTO(List<Client> clientList){
        return clientList.stream().map(ClientResponseDTO::new).collect(Collectors.toList());
    }

    public void updateClientData(Client client, ClientRequestDTO clientDTO){
        client.setName(clientDTO.getName());
        client.setCnpj(clientDTO.getCnpj());
        client.setEmail(clientDTO.getEmail());
        client.setTel(clientDTO.getTel());
        client.setUf(clientDTO.getUf());
        client.setLocation(clientDTO.getLocation());
    }
}
