package com.testeyoux.testeyoux.Controller;

import com.testeyoux.testeyoux.Entity.Admins;
import com.testeyoux.testeyoux.Repository.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admins")
public class AdminsController {
    @Autowired
    AdminsRepository adminsRepository;

    @GetMapping
    public List<Admins> getAllUsers(){
        return adminsRepository.findAll();
    }

}
