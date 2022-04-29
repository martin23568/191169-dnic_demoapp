package com.example.demo.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ROLE_TEACHER, ROLE_STUDENT;

    @Override
    public String getAuthority() {
        return name();
    }
}
