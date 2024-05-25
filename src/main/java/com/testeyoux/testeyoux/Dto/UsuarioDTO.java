package com.testeyoux.testeyoux.Dto;

import com.testeyoux.testeyoux.Entity.Admins;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

public class UsuarioDTO {
    @Setter
    private Long id;
    private String username;
    @Setter
    private String login;
    @Setter
    private String password;
    @Setter
    private String email;

    public UsuarioDTO(Admins admins) {
        BeanUtils.copyProperties(admins, this);

    }
    public UsuarioDTO() {

    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String nome) {
        this.username = username;
    }
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}
