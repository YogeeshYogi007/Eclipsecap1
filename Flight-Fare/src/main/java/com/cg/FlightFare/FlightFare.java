package com.cg.FlightFare;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlightFare")
public class FlightFare 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="domesticcharges")
	private String domesticcharges;
	@Column(name="internationalcharges")
	private String internationalcharges;
public FlightFare() {
	
}
public FlightFare(Integer id, String domesticcharges, String internationalcharges) {
	super();
	this.id = id;
	this.domesticcharges = domesticcharges;
	this.internationalcharges = internationalcharges;
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDomesticcharges() {
	return domesticcharges;
}
public void setDomesticcharges(String domesticcharges) {
	this.domesticcharges = domesticcharges;
}
public String getInternationalcharges() {
	return internationalcharges;
}
public void setInternationalcharges(String internationalcharges) {
	this.internationalcharges = internationalcharges;
}
@Override
public String toString() {
	return "FlightFare [id=" + id + ", domesticcharges=" + domesticcharges + ", internationalcharges="
			+ internationalcharges + "]";
}

	
}
