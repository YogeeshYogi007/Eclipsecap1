package com.cg.FlightFare;

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
public class FlightFareController
{
	   @Autowired
	   private FlightFareService service;
	   
	   // Retrieve All the rows from Database
		@GetMapping("/flightfare")
		public List<FlightFare> list()
		{
			return service.listAll();
		}
		
		//Retrieve Specific Records from Database
		
		@GetMapping("/flightfare/{id}")
		public ResponseEntity<FlightFare> get (@PathVariable Integer id)
		{
		try 
		
			{
			FlightFare flightFare = service.get(id);
				return new ResponseEntity<FlightFare>(flightFare, HttpStatus.OK);
			}
		 
		catch (Exception e) 
		{
			return new ResponseEntity<FlightFare>(HttpStatus.NOT_FOUND);
			
		}
		}
		
		//CREAT a row in database
		@PostMapping("/flightfare")
		public void add(@RequestBody FlightFare flightFare) 
		{
			service.save(flightFare);
		}
		
		// Update Operation - record in database
		@PutMapping("/flightfare/{id}")
		public ResponseEntity<?> update(@RequestBody FlightFare flightFare,@PathVariable Integer id)
		{
			try {
				FlightFare existUser = service.get(id);
				service.save(flightFare);
				return new ResponseEntity<FlightFare>(flightFare, HttpStatus.OK);
			} 
			catch (Exception e) 
			{
			
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		// Delete Operation
		@DeleteMapping("/flightfare/{id}")
		public void delete(@PathVariable Integer id) 
		{
			service.delete(id);
		}
		
	}
