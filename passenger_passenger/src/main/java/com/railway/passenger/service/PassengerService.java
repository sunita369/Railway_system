package com.railway.passenger.service;

import java.util.List;

import com.railway.passenger.models.Train;

public interface  PassengerService {
	public List<Train> getAllTrains();
	public Train getDetailsByTrainNo(String train_no);
	public String confirmation_noStatus(String confirmation_no);
	public List<Train> getTrainByStartStationandDestination(String starting_station,String destination);

}
