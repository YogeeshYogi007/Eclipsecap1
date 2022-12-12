package com.cg.FlightCustomerRegistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class FlightCustomerController 
{
	   @Autowired
	   private FlightCustomerService service;
	   
	   // Retrieve All the rows from Database
		@GetMapping("/flightcustomer")
		public List<FlightCustomer> list()
		{
			return service.listAll();
		}
		
		//Retrieve Specific Records from Database
		
		@GetMapping("/flightcustomer/{id}")
		public ResponseEntity<FlightCustomer> get (@PathVariable Integer id)
		{
		try 
		
			{
			FlightCustomer flightCustomer = service.get(id);
				return new ResponseEntity<FlightCustomer>(flightCustomer, HttpStatus.OK);
			}
		 
		catch (Exception e) 
		{
			return new ResponseEntity<FlightCustomer>(HttpStatus.NOT_FOUND);
			
		}
		}
		
		//CREAT a row in database
		@PostMapping("/flightcustomer")
		public void add(@RequestBody FlightCustomer flightCustomer) 
		{
			service.save(flightCustomer);
		}
		
		// Update Operation - record in database
		@PutMapping("/flightcustomer/{id}")
		public ResponseEntity<?> update(@RequestBody FlightCustomer flightCustomer,@PathVariable Integer id)
		{
			try {
				FlightCustomer existUser = service.get(id);
				service.save(flightCustomer);
				return new ResponseEntity<FlightCustomer>(flightCustomer, HttpStatus.OK);
			} 
			catch (Exception e) 
			{
			
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		// Delete Operation
		@DeleteMapping("/flightcustomer/{id}")
		public void delete(@PathVariable Integer id) 
		{
			service.delete(id);
		}
		
	}
