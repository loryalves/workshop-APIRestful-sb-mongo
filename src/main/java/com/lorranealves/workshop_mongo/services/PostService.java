package com.lorranealves.workshop_mongo.services;

import com.lorranealves.workshop_mongo.domain.Post;
import com.lorranealves.workshop_mongo.domain.User;
import com.lorranealves.workshop_mongo.dto.UserDTO;
import com.lorranealves.workshop_mongo.repository.PostRepository;
import com.lorranealves.workshop_mongo.repository.UserRepository;
import com.lorranealves.workshop_mongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}