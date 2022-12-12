package com.cg.FlightSearch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightSearch 
{
private Integer id;
private String fromlocation;
private String tolocation;
private String date;
private int fare;
public int getFare() {
	return fare;
}
public void setFare(int fare) {
	this.fare = fare;
}
public FlightSearch() {
	
}
public FlightSearch(Integer id, String fromlocation, String tolocation, String date) {
	super();
	this.id = id;
	this.fromlocation = fromlocation;
	this.tolocation = tolocation;
	this.date = date;
	this.fare = fare;
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFromlocation() {
	return fromlocation;
}
public void setFromlocation(String fromlocation) {
	this.fromlocation = fromlocation;
}
public String getTolocation() {
	return tolocation;
}
public void setTolocation(String tolocation) {
	this.tolocation = tolocation;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "FlightSearch [id=" + id + ", fromlocation=" + fromlocation + ", tolocation=" + tolocation + ", date=" + date
			+ ", fare=" + fare + "]";
}


	
	
}
