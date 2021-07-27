package com.lorranealves.workshop_mongo.repository;

import com.lorranealves.workshop_mongo.domain.Post;
import com.lorranealves.workshop_mongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
