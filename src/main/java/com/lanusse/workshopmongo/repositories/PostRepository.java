package com.lanusse.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lanusse.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {    
    
}