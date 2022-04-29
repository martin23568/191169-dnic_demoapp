package com.example.demo.model.exceptions;

import org.h2.mvstore.Chunk;

public class UsernameAlreadyExistsException extends RuntimeException {
    public UsernameAlreadyExistsException(String username){
        super(String.format("User with username %s already exists!", username));
    }
}
