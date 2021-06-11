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
	
	public Train updateTrain(String train_no,Train train) {
		Train Details= repo.findById(train_no).orElseThrow();{
			Details.setTrain_no(train.getTrain_no());
			Details.setArrival_time(train.getArrival_time());
			Details.setDeparture_time(train.getDeparture_time());
			Details.setStarting_station(train.getStarting_station());
			Details.setDestination(train.getDestination());
			Details.setFare(train.getFare());
			Details.setJourney_time(train.getJourney_time());
			Details.setJourney_route(train.getJourney_route());
			Details.setTotal_distance(train.getTotal_distance());
			return repo.save(Details);
		}
	}

}
