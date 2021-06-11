package com.railway.passenger.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.passenger.models.PassengerModel;
import com.railway.passenger.models.Train;
import com.railway.passenger.service.PassengerServiceImpl;

@RestController
@RequestMapping("/Train")
public class PassengerController {
	
	@Autowired
	private PassengerServiceImpl mainrepo;
	
	@GetMapping("/allTrains")
	public List<Train> getAllTrains(){
		return mainrepo.getAllTrains();
	}
	@GetMapping("/booking/{confirmation_no}")
	public String getStatus(@PathVariable String confirmation_no){
		return mainrepo.confirmation_noStatus(confirmation_no);
	}
	@GetMapping("/{starting_station}/{destination}")
	public List<Train> getTrainByStartStationandDestination(@PathVariable String starting_station,@PathVariable String destination)
	{
		return mainrepo.getTrainByStartStationandDestination(starting_station,destination);
	}
}
