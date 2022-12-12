package com.cg.FlightBooking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FlightBookingController 
{
	@Autowired
 private FlightBookingService service;
	 // Retrieve All the rows from Database
		@GetMapping("/flightbooking")
	public List<FlightCustomerBooking> list()
	{
	return service.listall();	
	}
	
		//Retrieve Specific Records from Database
		
		@GetMapping("/flightbooking/{id}")
		public ResponseEntity<FlightCustomerBooking> get (@PathVariable Integer id)
		{
		try 
		
			{
			FlightCustomerBooking flightcustomerbooking = service.get(id);
				return new ResponseEntity<FlightCustomerBooking>(flightcustomerbooking, HttpStatus.OK);
			}
		 
		catch (Exception e) 
		{
			return new ResponseEntity<FlightCustomerBooking>(HttpStatus.NOT_FOUND);
			
		}
		}
		
		//CREAT a row in database
		@PostMapping("/flightbooking")
		public void add(@RequestBody FlightCustomerBooking flightcustomerbooking) 
		{
			service.save(flightcustomerbooking);
		}
		
		// Update Operation - record in database
		@PutMapping("/flightbooking/{id}")
		public ResponseEntity<?> update(@RequestBody FlightCustomerBooking flightcustomerbooking,@PathVariable Integer id)
		{
			try {
				FlightCustomerBooking existflightcustomerbooking = service.get(id);
				service.save(flightcustomerbooking);
				return new ResponseEntity<FlightCustomerBooking>(flightcustomerbooking, HttpStatus.OK);
			} 
			catch (Exception e) 
			{
			
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		// Delete Operation
		@DeleteMapping("/flightbooking/{id}")
		public void delete(@PathVariable Integer id) 
		{
			service.delete(id);
		}
		
	}
