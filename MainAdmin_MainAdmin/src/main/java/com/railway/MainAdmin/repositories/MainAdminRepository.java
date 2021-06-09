package com.railway.MainAdmin.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.railway.MainAdmin.models.MainAdminModel;


public interface MainAdminRepository extends MongoRepository<MainAdminModel, String> {

}
