package com.cg.FlightBooking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlightCustomerBooking")
public class FlightCustomerBooking 
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
@Column(name="flightname")
 private String flightname;
@Column(name="flightnumber")
 private String flightnumber;
@Column(name="flightdestination")
 private String flightdestination;
@Column(name="flightairport")
 private String flightairport;
 
public FlightCustomerBooking() 
{
	
}

public FlightCustomerBooking(Integer id, String flightname, String flightnumber, String flightdestination,
		String flightairport) {
	super();
	this.id = id;
	this.flightname = flightname;
	this.flightnumber = flightnumber;
	this.flightdestination = flightdestination;
	this.flightairport = flightairport;
}



public FlightCustomerBooking(String flightname, String flightnumber, String flightdestination, String flightairport) {
	super();
	this.flightname = flightname;
	this.flightnumber = flightnumber;
	this.flightdestination = flightdestination;
	this.flightairport = flightairport;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getFlightname() {
	return flightname;
}

public void setFlightname(String flightname) {
	this.flightname = flightname;
}

public String getFlightnumber() {
	return flightnumber;
}

public void setFlightnumber(String flightnumber) {
	this.flightnumber = flightnumber;
}

public String getFlightdestination() {
	return flightdestination;
}

public void setFlightdestination(String flightdestination) {
	this.flightdestination = flightdestination;
}

public String getFlightairport() {
	return flightairport;
}

public void setFlightairport(String flightairport) {
	this.flightairport = flightairport;
}

@Override
public String toString() {
	return "FlightCustomerBooking [id=" + id + ", flightname=" + flightname + ", flightnumber=" + flightnumber
			+ ", flightdestination=" + flightdestination + ", flightairport=" + flightairport + "]";
}
	


}
