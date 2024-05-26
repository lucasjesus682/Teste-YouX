package com.testeyoux.testeyoux.Controller;

import com.testeyoux.testeyoux.Entity.UF;
import com.testeyoux.testeyoux.Service.UFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ufs")
public class UFController {

    @Autowired
    private UFService ufService;

    @GetMapping
    public ResponseEntity<List<UF>> getUFs() {
        List<UF> ufs = ufService.fetchUFs();
        return ResponseEntity.ok(ufs);
    }
}