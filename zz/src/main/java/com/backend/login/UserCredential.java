package com.backend.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="UserCredential")
public class UserCredential {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="emailId")
	private String emailId;
	@Column(name="password")
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public UserCredential(int id, String emailId, String password, UserInfo userInfo) {
		this.id = id;
		this.emailId = emailId;
		this.password = password;
	}
	public UserCredential() {
		
	}
	@Override
	public String toString() {
		return "UserCredential [id=" + id + ", emailId=" + emailId + ", password=" + password + "]";
	}

	


}
