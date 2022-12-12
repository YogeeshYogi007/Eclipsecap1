package com.backend.login;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	Repository repository;
	
	//to get all
	
	@GetMapping("/all")
	public List<Meal> getall(){
		return repository.findAll();
	}
	
	// to get a specific by id
	@GetMapping("/{id}")
	public Meal getById(@PathVariable("id") Long id) {
		return repository.findById(id).get();
	}
	
	//to add a new record
	@PostMapping("/new")
	public Meal addnew(@RequestBody Meal meal){
		return repository.save(meal);
	}
	
	//to update a existing data
	@PutMapping("/redo")
	public ResponseEntity<Meal> update(@PathVariable("id") Long id,@RequestBody Meal meal){
		try {
			Optional<Meal> meal1= repository.findById(id);
			repository.save(meal);
			return new ResponseEntity<Meal>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Meal>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}

}
