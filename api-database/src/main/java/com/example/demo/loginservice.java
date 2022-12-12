package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginservice {
 @Autowired
 private loginrepo Repo;
 
 //to get all the data from D B
 public List<DAO> getall(){
	 return Repo.findAll();
 }
 
 //to get a specific record by first name
 public DAO getbyname(String Username) {
	 return Repo.findByusername();
 }
 
 //to add a new data to D B
 public void add(DAO dao) {
	 Repo.save(dao);
	 
 }
 
 //to delete a data from D B
 public void delete(String username) {
	 Repo.deleteByusername(username);
 }
 
 //to update a data in D B 
 public void update(DAO dao, String Username) {
	 Repo.save(Username);
 }
 
 
}
