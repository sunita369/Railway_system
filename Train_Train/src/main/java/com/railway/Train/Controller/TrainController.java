package com.railway.Train.Controller;

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

import com.railway.Train.Models.TrainModel;
import com.railway.Train.Repositories.TrainRepository;

@RestController
@RequestMapping("/Train")
public class TrainController {

	@Autowired
	private TrainRepository repo;
	
	@PostMapping("/addTrain")
	public String saveBook(@RequestBody TrainModel train ) {
		repo.save(train);
		return "Added Train with id:" + train.getId();
	}
	
	@GetMapping("/findAllTrain")
	public List<TrainModel> getBooks(){
		return repo.findAll();
	}
	
	@GetMapping("/findAllTrain/{id}")
	public Optional<TrainModel> getBook(@PathVariable String id){
		return repo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable String id) {
		repo.deleteById(id);
		return "Train deleted with id:" +id;
	}
	
	@PutMapping("/update/{id}")
	public TrainModel updateBook(@PathVariable String id, @RequestBody TrainModel train) {
		train.setId(id);
		repo.save(train);
		return train;
	}

}
