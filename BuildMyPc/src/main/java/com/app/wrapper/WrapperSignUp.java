package com.app.wrapper;

public class WrapperSignUp {
	private String email;
	private String name;
	private String dob;
	private String mob;
	private String password;
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	
	public String getMob() {
		return mob;
	}
	public String getPassword() {
		return password;
	}
	public String getDob() {
		return dob;
	}
	@Override
	public String toString() {
		return "WrapperSignUp [email=" + email + ", name=" + name + ", dob=" + dob + ", mob=" + mob + ", password="
				+ password + "]";
	}
	
	
	
	
}
