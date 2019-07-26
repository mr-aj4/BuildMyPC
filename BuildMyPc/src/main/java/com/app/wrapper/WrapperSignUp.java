package com.app.wrapper;

import java.time.LocalDate;

public class WrapperSignUp {
	private String email;
	private String name;
	private LocalDate dob;
	private String mob;
	private String password;
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public String getMob() {
		return mob;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "WrapperSignUp [email=" + email + ", name=" + name + ", dob=" + dob + ", mob=" + mob + ", password="
				+ password + "]";
	}
	
	
	
}
