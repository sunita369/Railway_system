package com.railway.booking.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document (collection = "TicketReservation")
public class TicketDetails {
	@Transient
	public static final String SEQUENCE_NAME = "ticket_sequence";
	
	@Id
	private int ticket_sequence;
	
	@Field
	private String pnr_number;
	@Field
	private String coach_no;
	@Field
	private String seat_no;
	@Field
	private String journey_time;
	@Field
	private String boarding_station;
	@Field
	private String destination;
	@Field
	private String booking_time;
	@Field
	private String boarding_time;
	@Field
	private String passenger_name;
	@Field
	private String passenger_age;
	@Field
	private String passenger_gender;
	@Field
	private String train_no;
	
	public TicketDetails() {
		super();
	}
	
	public TicketDetails(int ticket_sequence, String pnr_number, String coach_no, String seat_no, String journey_time, String boarding_station, String destination,
			String booking_time, String boarding_time, String passenger_name, String passenger_age, String passenger_gender, String train_no ) {
		this.pnr_number = pnr_number;
		this.coach_no = coach_no;
		this.seat_no = seat_no;
		this.journey_time = journey_time;
		this.boarding_station = boarding_station;
		this.destination = destination;
		this.booking_time = booking_time;
		this.boarding_time = boarding_time;
		this.passenger_name = passenger_name;
		this.passenger_age = passenger_age;
		this.passenger_gender = passenger_gender;
		this.train_no = train_no ;
		this.ticket_sequence = ticket_sequence;
	}
	
		public int getTicket_sequence() {
		return ticket_sequence;
	}

	public void setTicket_sequence(int i) {
		this.ticket_sequence = i;
	}
	
	public String getPnr_number() {
		return pnr_number;
	}

	public void setPnr_number(String pnr_number) {
		this.pnr_number = pnr_number;
	}

	public String getCoach_no() {
		return coach_no;
	}

	public void setCoach_no(String coach_no) {
		this.coach_no = coach_no;
	}
	
	public String getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}

	public String getJourney_time() {
		return journey_time;
	}

	public void setJourney_time(String journey_time) {
		this.journey_time = journey_time;
	}

	public String getBoarding_station() {
		return boarding_station;
	}

	public void setBoarding_station(String boarding_station) {
		this.boarding_station = boarding_station;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getBooking_time() {
		return booking_time;
	}

	public void setBooking_time(String booking_time) {
		this.booking_time = booking_time;
	}

	public String getBoarding_time() {
		return boarding_time;
	}

	public void setBoarding_time(String boarding_time) {
		this.boarding_time = boarding_time;
	}

	public String getPassenger_name() {
		return passenger_name;
	}

	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}

	public String getPassenger_age() {
		return passenger_age;
	}

	public void setPassenger_age(String passenger_age) {
		this.passenger_age = passenger_age;
	}

	public String getPassenger_gender() {
		return passenger_gender;
	}

	public void setPassenger_gender(String passenger_gender) {
		this.passenger_gender = passenger_gender;
	}
	
	public String getTrain_no() {
		return train_no;
	}

	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}

	@Override
	public String toString() {
		return "TicketDetails [ pnr_number=" + pnr_number + ", coach_no=" + coach_no + ", seat_no="
				+ seat_no + ", journey_time=" + journey_time + ", boarding_station=" + boarding_station
				+ ", destination=" + destination + ", booking_time=" + booking_time + ", boarding_time=" + boarding_time
				+ ", passenger_name=" + passenger_name + ", passenger_age=" + passenger_age + ", passenger_gender="
				+ passenger_gender + ", train_no=" + train_no + "]";
	}





}
