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
@RequestMapping("/teacher")
public class tcontroller {

	@Autowired
	private tservice service;
	
	
	//to get all the list from D B
	@GetMapping("/all")
		public List<Teacher> getall(){
			return service.getall();
		}
	
	//to get a specific list form D B
	@GetMapping("/{id}")
	public ResponseEntity<Teacher> get(@PathVariable int id) {
		try {
			Teacher teacher = service.get(id);
			return new ResponseEntity<Teacher>(teacher,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Teacher>(HttpStatus.NOT_FOUND);
		}
	}
	
	//to add a new data to D B
	@PostMapping("/new")
	public void add(@RequestBody Teacher teacher) {
		 service.add(teacher);
		
	}
	
	//to delete a data from D B
	@DeleteMapping("/{id}")
	public void delete(@PathVariable  int id) {
		service.delete(id);
	}
	
	// to update a data from D B
	@PutMapping("/{id}")
	public ResponseEntity<Teacher> update(@RequestBody Teacher teacher, @PathVariable int id){
		try {
			Teacher teacher1 = service.get(id);
			service.add(teacher);
			 return new ResponseEntity<Teacher>(teacher,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Teacher>(HttpStatus.NOT_FOUND);
		}
	}
}
