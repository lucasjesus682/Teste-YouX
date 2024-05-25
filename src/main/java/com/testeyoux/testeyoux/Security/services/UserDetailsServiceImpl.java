package com.testeyoux.testeyoux.Security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testeyoux.testeyoux.Entity.Admins;
import com.testeyoux.testeyoux.Repository.AdminsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    AdminsRepository adminsRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admins admin = adminsRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with Username" + username));

        return UserDetailsImpl.build(admin);
    }
}