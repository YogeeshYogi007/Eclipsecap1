package com.backend.login;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="UserCredential")
public class UserCredential {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int Id;
	@Column(name="password")
	private String Password;
	@Column(unique=true)
	private String EmailId;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
	
	public UserCredential(int id, String password, String emailId) {
		Id = id;
		Password = password;
		EmailId = emailId;
	}
	
	
	public UserCredential() {
	}
	
	
	@Override
	public String toString() {
		return "UserCredential [Id=" + Id + ", Password=" + Password + ", EmailId=" + EmailId + "]";
	}
	
	
	

}
