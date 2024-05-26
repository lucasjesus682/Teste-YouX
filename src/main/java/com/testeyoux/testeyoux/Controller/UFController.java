package com.testeyoux.testeyoux.Controller;

import com.testeyoux.testeyoux.Service.UFServiceImpl;
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
    private UFServiceImpl ufServiceImpl;

    @GetMapping
    public ResponseEntity<List<String>> getUFs() {
        List<String> ufs = ufServiceImpl.fetchSiglas();
        return ResponseEntity.ok(ufs);
    }
}