package com.ENSF607.AnimalProject.model;

public class LoginRequest {

	private String fName;
	private String password;
	
	public LoginRequest(String fName, String password) {
		this.fName = fName;
		this.password = password;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
