package com.railway.MainAdmin.Controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.MainAdmin.Service.MainAdminService;
import com.railway.MainAdmin.models.Train;

@RestController
@RequestMapping("/Train")
public class MainAdminController {
	
	@Autowired
	private MainAdminService repo;
	
	@PostMapping("/addTrain")
	public String saveTrain(@RequestBody Train train) {
		repo.addTrain(train);
		return "added Train with id:" + train.getId();
	}
	
	@GetMapping("/findAllTrain")
	public List<Train> getTrains(){
		return repo.getAllTrain();
	}
	
	@GetMapping("/findAllTrain/{train_no}")
	public Optional<Train> getTrain(@PathVariable String train_no){
		return repo.getTrainbyTrain_no(train_no);
	}
	
	@DeleteMapping("/delete/{train_no}")
	public String deleteFlight(@PathVariable String train_no) {
		repo.deleteTrain(train_no);
		return "Admin deleted with id:" +train_no;
	}
	
	


}
