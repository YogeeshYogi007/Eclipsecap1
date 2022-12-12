package com.cg.FlightCustomerRegistration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightCustomer 
{
private Integer id;
private String firstname;
private String lastname;
private String age;
private String email;
private String phonenumber;
private String gender;
private String country;
private String state;
private String city;
private String pincode;
private String address;
public FlightCustomer() 
{
	
}
public FlightCustomer(Integer id, String firstname, String lastname, String age, String email, String phonenumber,
		String gender, String country, String state, String city, String pincode, String address) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.email = email;
	this.phonenumber = phonenumber;
	this.gender = gender;
	this.country = country;
	this.state = state;
	this.city = city;
	this.pincode = pincode;
	this.address = address;
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "FlightCustomer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
			+ ", email=" + email + ", phonenumber=" + phonenumber + ", gender=" + gender + ", country=" + country
			+ ", state=" + state + ", city=" + city + ", pincode=" + pincode + ", address=" + address + "]";
}


}
