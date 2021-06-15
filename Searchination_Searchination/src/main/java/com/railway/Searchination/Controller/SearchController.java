package com.railway.Searchination.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.Searchination.models.Train;
import com.railway.Searchination.repositories.SearchinationRepository;

@RestController
@RequestMapping("/Search")
public class SearchController {
	@Autowired
	private SearchinationRepository searchrepo;
	
	@GetMapping("/findAllTrain")
	public List<Train> getAllTrains() {
		return searchrepo.findAll();
	}

	// find Train  details by Train number
	@GetMapping("/findAllTrain/{train_no}")
	public Train getTrainByTrain_no(@PathVariable String train_no) {
		return searchrepo.findByTrain_no(train_no);
	}
	
	@GetMapping("/{starting_station}/{destination}")
	public List<Train> getTrainByStartStationandDestination(@PathVariable String starting_station, @PathVariable String destination) {
		return searchrepo.getTrainByStartStationandDestination(starting_station, destination);
	}



}
