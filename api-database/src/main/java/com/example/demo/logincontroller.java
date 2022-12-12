package com.example.demo;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class logincontroller {
	@Autowired
	private loginservice service;
	
	
	//to get all the record
	@GetMapping("/get")
	public List<DAO> getall(){
		return service.getall();
	}
	
	//to get a data by user name
	@GetMapping("/{Username}")
	public ResponseEntity<DAO> getbyname(@PathVariable("Username") String Username) {
		try {
			DAO dao= service.getbyname(Username);
			return new ResponseEntity<DAO>(dao,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<DAO>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	//to add a completely new record
	@PostMapping("/new")
	public void add(@RequestBody DAO dao) {
		service.add(dao);
	}
	
	//to delete a specific record
	@DeleteMapping("/{Username}")
	public void delete(@PathVariable("Username") String Username) {
		service.delete(Username);
	}
	
	//to update a specific record by user name
	@PutMapping("/{Username}")
	public ResponseEntity<DAO> update(@RequestBody DAO dao, @PathVariable("Username") String Username){
		try {
			DAO dao1=service.getbyname(Username);
			service.add(dao);
			return new ResponseEntity<DAO>(dao,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<DAO>(HttpStatus.NOT_FOUND);
		}
	}
}
