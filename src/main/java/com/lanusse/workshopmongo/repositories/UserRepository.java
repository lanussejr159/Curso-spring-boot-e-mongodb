package com.lanusse.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lanusse.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
    
}
