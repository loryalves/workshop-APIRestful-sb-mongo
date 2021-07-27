package com.lorranealves.workshop_mongo.services;

import com.lorranealves.workshop_mongo.domain.User;
import com.lorranealves.workshop_mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
