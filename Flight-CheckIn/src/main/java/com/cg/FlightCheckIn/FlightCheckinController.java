package com.cg.FlightCheckIn;

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
public class FlightCheckinController 
{
	   @Autowired
	   private FlightCheckinService service;
	   
	   // Retrieve All the rows from Database
		@GetMapping("/flightcheckin")
		public List<FlightCheckin> list()
		{
			return service.listAll();
		}
		
		//Retrieve Specific Records from Database
		
		@GetMapping("/flightcheckin/{id}")
		public ResponseEntity<FlightCheckin> get (@PathVariable Integer id)
		{
		try 
		
			{
			FlightCheckin flightCheckin = service.get(id);
				return new ResponseEntity<FlightCheckin>(flightCheckin, HttpStatus.OK);
			}
		 
		catch (Exception e) 
		{
			return new ResponseEntity<FlightCheckin>(HttpStatus.NOT_FOUND);
			
		}
		}
		
		//CREAT a row in database
		@PostMapping("/flightcheckin")
		public void add(@RequestBody FlightCheckin flightCheckin) 
		{
			service.save(flightCheckin);
		}
		
		// Update Operation - record in database
		@PutMapping("/flightcheckin/{id}")
		public ResponseEntity<?> update(@RequestBody FlightCheckin flightCheckin,@PathVariable Integer id)
		{
			try {
				FlightCheckin existUser = service.get(id);
				service.save(flightCheckin);
				return new ResponseEntity<FlightCheckin>(flightCheckin, HttpStatus.OK);
			} 
			catch (Exception e) 
			{
			
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		// Delete Operation
		@DeleteMapping("/flightcheckin/{id}")
		public void delete(@PathVariable Integer id) 
		{
			service.delete(id);
		}
		
	}

/*{

	  @GetMapping("/flightcheckin") public String data() { return
	  "Hello world i am in flight checkin microservice"; }
	 
}*/