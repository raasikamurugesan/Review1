package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
//@Table(name="Admin")
public class AdminModel
{
    @Id
	private String Email;
	private String Password;
	private String MobileNumber;
	private String UserRole;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getUserRole() {
		return UserRole;
	}
	public void setUserRole(String userRole) {
		UserRole = userRole;
	}
}
