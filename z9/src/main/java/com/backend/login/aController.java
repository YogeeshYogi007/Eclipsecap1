package com.backend.login;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aController {
	
	@Autowired
	aRepoitory repo;
	
	
	//to get all data
	@GetMapping("/all")
	public List<Allergens> getall(){
		return repo.findAll();
	}
	
	//to get by id
	@GetMapping("/{id}")
	public List<Allergens> getByID(@PathVariable("peanuts") String peanuts) {
		return repo.findByPeanuts(peanuts);
	}
	
	//to add new record
	@PutMapping("/redo")
	public ResponseEntity<Allergens> update(@PathVariable("peanuts") String peanuts,@RequestBody Allergens al){
		try {
			List<Allergens> al1= repo.findByPeanuts(peanuts);
			repo.save(al);
			return new ResponseEntity<Allergens>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Allergens>(HttpStatus.NOT_FOUND);
		}
	}
	
	// to delete record
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String peanuts) {
		repo.deleteByPeanuts(peanuts);
	} 
}
