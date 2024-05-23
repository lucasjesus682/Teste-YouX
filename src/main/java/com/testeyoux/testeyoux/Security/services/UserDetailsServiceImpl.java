package com.testeyoux.testeyoux.Security.services;

import com.testeyoux.testeyoux.Entity.Admins;
import com.testeyoux.testeyoux.Repository.AdminsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    AdminsRepository adminsRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admins admins = adminsRepository.finByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found with Username" + username));

        return UserDetailsImpl.build(admins);
    }
}