package com.railway.MainAdmin.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.railway.MainAdmin.models.Train;
import com.railway.MainAdmin.repositories.MainAdminRepository;

@Service
public class MainAdminService {
	@Autowired
	private MainAdminRepository repo;
	
	public void addTrain (Train train) {
		repo.save(train);
	}
	public List<Train> getAllTrain(){
		return repo.findAll();
	}
	
	public Optional<Train> getTrainbyTrain_no(String train_no){
		return repo.findById(train_no);
	}
	@DeleteMapping("/delete/{train_no}")
	public String deleteTrain(String train_no) {
		repo.deleteById(train_no);
		return "Train deleted with id:" +train_no;
	}

}
