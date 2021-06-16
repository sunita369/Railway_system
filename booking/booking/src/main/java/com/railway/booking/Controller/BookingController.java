package com.railway.booking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.booking.Model.TicketDetails;
import com.railway.booking.Service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/ticket/add")
	public String addUserDetails(@RequestBody TicketDetails ticketDetails)
	{
		ticketDetails.setTicket_sequence(bookingService.getNextSequence(ticketDetails.SEQUENCE_NAME));
		

	    return bookingService.addTicketBookingDetails(ticketDetails);	
    }

}
