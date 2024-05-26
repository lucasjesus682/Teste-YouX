package com.testeyoux.testeyoux.Service;

import com.testeyoux.testeyoux.Dto.Request.ClientRequestDTO;
import com.testeyoux.testeyoux.Dto.Response.ClientResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    ClientResponseDTO findById(Long id);

    List<ClientResponseDTO> findAll();

    ClientResponseDTO register(ClientRequestDTO personDTO);

    ClientResponseDTO update(Long id, ClientRequestDTO personDTO);

    String delete(Long id);

    String getNameClientById(Long id);
}
