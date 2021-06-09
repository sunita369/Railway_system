package com.railway.Train.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.railway.Train.Models.TrainModel;

public interface TrainRepository extends MongoRepository<TrainModel ,String>{

}
