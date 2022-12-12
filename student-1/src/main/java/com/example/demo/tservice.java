package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tservice {

	@Autowired 
	private trepo repo;

	//to get all the list of teacher
	public List<Teacher> getall(){
		return repo.findAll();
	}
	
	//to get a specific list of teacher by id
	public Teacher get(int id) {
		return repo.findById(id).get();
	}
	
	//to add the new list 
	public void add(Teacher teacher) {
		repo.save(teacher);
	}
	
	//to delete a specific record
	public void delete(int id) {
		repo.deleteById(id);
	}
}
