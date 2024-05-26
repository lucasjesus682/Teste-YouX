package com.testeyoux.testeyoux.Service;

import com.testeyoux.testeyoux.Dto.Request.ClientRequestDTO;
import com.testeyoux.testeyoux.Dto.Response.ClientResponseDTO;
import com.testeyoux.testeyoux.Entity.Client;
import com.testeyoux.testeyoux.Repository.ClientRepository;
import com.testeyoux.testeyoux.Util.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    private final ClientMapper clientMapper;

    @Override
    public ClientResponseDTO findById(Long id) {
        return clientMapper.toClientDTO(returnClient(id));
    }

    @Override
    public List<ClientResponseDTO> findAll() {
        List<Client> clientList = clientRepository.findAll();

        return clientMapper.toPeopleDTO(clientRepository.findAll());
    }

    @Override
    public ClientResponseDTO register(ClientRequestDTO clientDTO) {
        Client client = clientMapper.toClient(clientDTO);

        return clientMapper.toClientDTO(clientRepository.save(client));
    }


    @Override
    public ClientResponseDTO update(Long id, ClientRequestDTO clientDTO ) {
        Client client = returnClient(id);

        clientMapper.updateClientData(client, clientDTO);

        return clientMapper.toClientDTO(clientRepository.save(client));
    }

    @Override
    public String delete(Long id) {
        clientRepository.deleteById(id);
        return "Client id:" + id + "deleted";
    }

    private Client returnClient (Long id){
        return clientRepository.findById(id).orElseThrow(() -> new RuntimeException("client not found"));
    }

    public String getNameClientById(Long id){
        Client client = clientRepository.findById(id).orElseThrow();
        return client.getName();
    }
}
