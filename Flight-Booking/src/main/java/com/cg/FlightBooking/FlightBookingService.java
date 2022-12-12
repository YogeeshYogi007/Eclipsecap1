package com.cg.FlightBooking;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FlightBookingService 
{
@Autowired
	private FlightBookingRepository repository;
public List<FlightCustomerBooking> listall()
{
	return repository.findAll();
}

public FlightCustomerBooking get(Integer id) 
{
	return repository.findById(id).get();
}
	public void save(FlightCustomerBooking flightcustomerbooking) 
	{
		repository.save(new FlightCustomerBooking(flightcustomerbooking.getFlightname(),flightcustomerbooking.getFlightnumber(),flightcustomerbooking.getFlightdestination(),flightcustomerbooking.getFlightairport()));
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
}
