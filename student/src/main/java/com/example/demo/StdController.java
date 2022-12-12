package com.example.demo;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/std")
public class StdController {

	@Autowired
	private stdService service;
	
	
	//to get all the list of student
	@GetMapping("/all")
	public List<Student> getall(){
		return service.getall();
	}
	
	//to get a specific list from students table
	@GetMapping("/{id}")
	public ResponseEntity<Student> get(@PathVariable int id) {
		try {
			Student student = service.get(id);
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	//to create a row in Data Base for new student
	@PostMapping("/new")
	public void add(@RequestBody Student student){
		
		 service.add(student);
	}
	
	//to update a row of a list in Data Base
	@PutMapping("/{id}")
	public ResponseEntity<Student> update(@RequestBody Student student, @PathVariable int id){
		try {
			Student student1= service.get(id);
			service.add(student);
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	//to delete a specific row 
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
}
