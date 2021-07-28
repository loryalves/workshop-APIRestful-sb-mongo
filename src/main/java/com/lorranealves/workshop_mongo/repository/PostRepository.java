package com.lorranealves.workshop_mongo.repository;

import com.lorranealves.workshop_mongo.domain.Post;
import com.lorranealves.workshop_mongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);
}
