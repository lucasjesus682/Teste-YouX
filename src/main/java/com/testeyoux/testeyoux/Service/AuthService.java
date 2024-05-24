package com.testeyoux.testeyoux.Service;

import com.testeyoux.testeyoux.Dto.AccessDTO;
import com.testeyoux.testeyoux.Dto.AuthenticationDTO;
import com.testeyoux.testeyoux.Security.jwt.JwtUtils;
import com.testeyoux.testeyoux.Security.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    public AccessDTO login (AuthenticationDTO authenticationDTO) {

        try {
            //Cria mecanismo de credencial para o spring
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(authenticationDTO.getUsername(),
                    authenticationDTO.getPassword());
            //Prepara mecanismo para autenticacao
            Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

            //Busca usuario logado
            UserDetailsImpl userAuthenticate = (UserDetailsImpl) authentication.getPrincipal();

            String token = jwtUtils.generateJwtToken((Authentication) userAuthenticate);
        }catch(BadCredentialsException e){
            //TODO LOGIN OU SENHA INVALIDO
        }
        return null;
    }
}
