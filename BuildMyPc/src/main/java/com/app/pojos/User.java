package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@Column(length=30,name="Email")
	private String email;
	
	@Column(name="Name",length=30)
	private String name;
	
	@Column(name="Date_of_birth")
	private LocalDate dob;
	
	@Column(name="Date_of_creation")
	private LocalDate doc = LocalDate.now(); 
	
	@Column(name="Mobile_No",length=15,unique=true)
	private String mob;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public LocalDate getDoc() {
		return doc;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}