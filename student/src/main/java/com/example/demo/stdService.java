package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class stdService {
	@Autowired
	private stdrepo Repo;
	
	//to get all students details
	public List<Student> getall(){
		return Repo.findAll();
	}
	
	//to get a particular student detail by id
	public Student get(int id) {
		return Repo.findById(id).get();
		
	}
	
	//to enter a new student to the list
	public void add(Student std){
		 Repo.save(std);
		
	}
	//to delete a particular list by id
	public void delete(int id) {
		Repo.deleteById(id);
	}
	
	//to update a specific record
	public void update (Student std,int id) {
			Repo.save(std);
		
		
	}
	
}
