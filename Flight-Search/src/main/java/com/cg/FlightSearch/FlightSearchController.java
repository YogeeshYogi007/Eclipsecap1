package com.cg.FlightSearch;

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
public class FlightSearchController

{
	   @Autowired
	   private FlightSearchService service;
	   
	   // Retrieve All the rows from Database
		@GetMapping("/flightsearch")
		public List<FlightSearch> list()
		{
			return service.listAll();
		}
		
		//Retrieve Specific Records from Database
		
		@GetMapping("/flightsearch/{id}")
		public ResponseEntity<FlightSearch> get (@PathVariable Integer id)
		{
		try 
		
			{
			FlightSearch flightSearch = service.get(id);
				return new ResponseEntity<FlightSearch>(flightSearch, HttpStatus.OK);
			}
		 
		catch (Exception e) 
		{
			return new ResponseEntity<FlightSearch>(HttpStatus.NOT_FOUND);
			
		}
		}
		
		//CREAT a row in database
		@PostMapping("/flightsearch")
		public void add(@RequestBody FlightSearch flightSearch) 
		{
			service.save(flightSearch);
		}
		
		// Update Operation - record in database
		@PutMapping("/flightsearch/{id}")
		public ResponseEntity<?> update(@RequestBody FlightSearch flightSearch,@PathVariable Integer id)
		{
			try {
				FlightSearch existUser = service.get(id);
				service.save(flightSearch);
				return new ResponseEntity<FlightSearch>(flightSearch, HttpStatus.OK);
			} 
			catch (Exception e) 
			{
			
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		// Delete Operation
		@DeleteMapping("/flightsearch/{id}")
		public void delete(@PathVariable Integer id) 
		{
			service.delete(id);
		}
		
	}

/*{

	@GetMapping("/flightsearch")
	public String data() {
		return "Hello world i am in flight search micro service";
	}
	
	
}
*/