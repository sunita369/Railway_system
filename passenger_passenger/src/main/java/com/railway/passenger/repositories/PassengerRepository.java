package com.railway.passenger.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.railway.passenger.models.PassengerModel;

public interface PassengerRepository extends MongoRepository<PassengerModel, String>{

}
