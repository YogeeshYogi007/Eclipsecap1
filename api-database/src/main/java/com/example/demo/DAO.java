package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DAO {
	@Id
	private int id;
 private String Username;
 private String Password;
public String getUsername() {
	return Username;
}
public void setid(int Id) {
	id=Id;
}
public int getid() {
	return id;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public DAO(String username, String password, int Id) {
	Username = username;
	Password = password;
	id = Id;
}
public DAO() {
}
 
	
}
