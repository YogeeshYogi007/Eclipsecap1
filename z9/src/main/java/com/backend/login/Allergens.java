package com.backend.login;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Embeddable
public class Allergens {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="peantus", table="allergens")
	String peanuts;
	
	@Column(name="celery", table="allergens")
	String celery;
	
	@Column(name="sesame_seeds", table="allergens")
	String sesameSeeds;

	public String getPeanuts() {
		return peanuts;
	}

	public void setPeanuts(String peanuts) {
		this.peanuts = peanuts;
	}

	public String getCelery() {
		return celery;
	}

	public void setCelery(String celery) {
		this.celery = celery;
	}

	public String getSesameSeeds() {
		return sesameSeeds;
	}

	public void setSesameSeeds(String sesameSeeds) {
		this.sesameSeeds = sesameSeeds;
	}

	

}
