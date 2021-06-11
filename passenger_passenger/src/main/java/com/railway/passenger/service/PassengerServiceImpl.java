package com.railway.passenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.passenger.models.Card;
import com.railway.passenger.models.Train;
import com.railway.passenger.repositories.MainAdminRepository;
import com.railway.passenger.repositories.PassengerPaymentRepository;

@Service
public class PassengerServiceImpl implements PassengerService{
	@Autowired
	private MainAdminRepository adminrepo;
	
	@Autowired
	private PassengerPaymentRepository bookingrepo;
	
	public List<Train> getAllTrains(){
		List<Train> allTrainDetails = new ArrayList<Train>();
		adminrepo.findAll().forEach(train -> allTrainDetails.add(train));
		return allTrainDetails;

	}
	public String confirmation_noStatus(String confirmation_no) {
		Random rand = new Random();
		List<String> status=new ArrayList<String>();
		status.add("Your Booking is Confirmed");
		status.add("You have been put in Waiting list");
		status.add("No Seats Available Anymore!");
		List<Card> bookingList=bookingrepo.findAll();
		for(Card det:bookingList) {
			if(det.getConfirmation_no()==confirmation_no) {
				return status.get(rand.nextInt(status.size()));
			}
		}
		return "Status of Booking: "+confirmation_no;
	}


	@Override
	public Train getDetailsByTrainNo(String train_no) {
		return adminrepo.findById(train_no).orElseThrow();
	}
	
	@Override
	public List<Train> getTrainByStartStationandDestination(String starting_station, String destination) {
		List<Train> detList=adminrepo.findAll();
		List<Train> req=new ArrayList<Train>();
		for(Train tr:detList)
		{
			String starting=tr.getStarting_station();
			String final_station=tr.getDestination();
			if(starting.equals(starting_station) && final_station.equals(final_station))
			{
				req.add(tr);
			}
		}
		return req;
	}


}
