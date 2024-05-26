package com.testeyoux.testeyoux.Service;

import com.testeyoux.testeyoux.Dto.UFDTO;
import com.testeyoux.testeyoux.Entity.UF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UFServiceImpl implements UFService {
    @Autowired
    private RestTemplate restTemplate;

    public List<String> fetchSiglas() {
        ResponseEntity<UF[]> response = restTemplate.getForEntity("https://servicodados.ibge.gov.br/api/v1/localidades/estados", UF[].class);
        return Arrays.stream(Objects.requireNonNull(response.getBody()))
                .map(UF::getSigla)
                .collect(Collectors.toList());
    }

}
