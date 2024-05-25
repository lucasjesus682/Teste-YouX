package com.testeyoux.testeyoux.Service;

import com.testeyoux.testeyoux.Repository.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UsuarioService {

    @Autowired
    private AdminsRepository adminsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
}
