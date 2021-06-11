package com.railway.passenger.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.railway.passenger.models.Train;

@Repository
public interface MainAdminRepository extends MongoRepository<Train, String>{

}
