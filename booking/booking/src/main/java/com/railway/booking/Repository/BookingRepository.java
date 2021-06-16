package com.railway.booking.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.railway.booking.Model.TicketDetails;

@Repository
public interface BookingRepository extends MongoRepository<TicketDetails, String> {

}
