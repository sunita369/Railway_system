package com.railway.passenger.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.railway.passenger.models.Card;

@Repository
public interface  PassengerPaymentRepository extends MongoRepository<Card, Long>{

}
