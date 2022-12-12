package com.cg.FlightCheckIn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class FlightCheckin 

{

	private Integer id;
	private String flightstatus;
	public FlightCheckin() 
	{
	
	}
	public FlightCheckin(Integer id, String flightstatus) {
		super();
		this.id = id;
		this.flightstatus = flightstatus;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFlightstatus() {
		return flightstatus;
	}
	public void setFlightstatus(String flightstatus) {
		this.flightstatus = flightstatus;
	}
	@Override
	public String toString() {
		return "FlightCheckin [id=" + id + ", flightstatus=" + flightstatus + "]";
	}
	
}
