package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String SFirstname;
	private String SLastname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSFirstname() {
		return SFirstname;
	}
	public void setSFirstname(String sFirstname) {
		SFirstname = sFirstname;
	}
	public String getSLastname() {
		return SLastname;
	}
	public void setSLastname(String sLastname) {
		SLastname = sLastname;
	}
	public Teacher(int id, String name, String sFirstname, String sLastname) {
		this.id = id;
		this.name = name;
		SFirstname = sFirstname;
		SLastname = sLastname;
	}
	public Teacher() {
		
	}
	
	
	
	
}
