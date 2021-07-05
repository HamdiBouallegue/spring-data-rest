package com.hamdibouallegue.datarestdemo.repositories.handlers;

import com.hamdibouallegue.datarestdemo.models.Client;
import com.hamdibouallegue.datarestdemo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolationException;
import java.util.HashSet;

@Component
@RepositoryEventHandler
public class ClientEventHandler {
    @Autowired
    ClientRepository clientRepository;
    @HandleBeforeCreate
    public void handleClientCreate(Client client) {
        Client returnedClient = clientRepository.findByEmail(client.getEmail());
        if(returnedClient !=null){
            throw new ConstraintViolationException("email must  be unique", new HashSet<>());
        }
    }
} 