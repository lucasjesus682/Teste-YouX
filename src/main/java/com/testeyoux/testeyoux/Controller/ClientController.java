package com.testeyoux.testeyoux.Controller;

import com.testeyoux.testeyoux.Dto.Request.ClientRequestDTO;
import com.testeyoux.testeyoux.Dto.Response.ClientResponseDTO;
import com.testeyoux.testeyoux.Service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/client")
@RequiredArgsConstructor
@Controller
public class ClientController {

    @Autowired
    private final ClientService clientService;

    @GetMapping(value = "{id}")
    public ResponseEntity <ClientResponseDTO> findById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok().body(clientService.findById(id));
    }

    @GetMapping
    public ResponseEntity <List<ClientResponseDTO>> findAll(){
        return ResponseEntity.ok().body(clientService.findAll());
    }

    @PostMapping
    public ResponseEntity<ClientResponseDTO> register(@RequestBody ClientRequestDTO clientDTO, UriComponentsBuilder uriBuilder){

        ClientResponseDTO clientResponseDTO = clientService.register(clientDTO);

        URI uri = uriBuilder.path("/client/{id}").buildAndExpand(clientResponseDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(clientResponseDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ClientResponseDTO> update(@RequestBody ClientRequestDTO clientDTO, @PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(clientService.update(id, clientDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok().body(clientService.delete(id));
    }
}
