package com.railway.passenger.controller;

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

import com.railway.passenger.models.PassengerModel;
import com.railway.passenger.repositories.PassengerRepository;

@RestController
@RequestMapping("/Passenger")
public class PassengerController {
	
	@Autowired
	private PassengerRepository repo;
	
	@PostMapping("/addPassenger")
	public String saveBook(@RequestBody PassengerModel passenger) {
		repo.save(passenger);
		return "added Passenger with id:" + passenger.getId();
	}
	
	@GetMapping("/findAllPassenger")
	public List<PassengerModel> getBooks(){
		return repo.findAll();
	}
	
	@GetMapping("/findAllPassenger/{id}")
	public Optional<PassengerModel> getBook(@PathVariable String id){
		return repo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable String id) {
		repo.deleteById(id);
		return "Passenger deleted with id:" +id;
	}
	
	@PutMapping("/update/{id}")
	public PassengerModel updateBook(@PathVariable String id, @RequestBody PassengerModel passenger) {
		passenger.setId(id);
		repo.save(passenger);
		return passenger;
	}

}
