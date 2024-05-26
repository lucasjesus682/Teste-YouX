package com.testeyoux.testeyoux.Service;

import com.testeyoux.testeyoux.Entity.UF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UFService {
    @Autowired
    private RestTemplate restTemplate;

    public List<UF> fetchUFs() {
        ResponseEntity<UF[]> response = restTemplate.getForEntity("https://servicodados.ibge.gov.br/api/v1/localidades/estados", UF[].class);
        return Arrays.asList(response.getBody());
    }
}
