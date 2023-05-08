package com.example.demo.Model;

import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
//@Table(name="User")
public class UserModel 
{
	@Id
	private String Id;
	private String Email;
	private String Password;
	private String Username;
	private String MobileNumber;
	private String UserRole;
	private int LoanId;
	private String LoanApplicationModel;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
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
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
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
	public int getLoanId() {
		return LoanId;
	}
	public void setLoanId(int loanId) {
		LoanId = loanId;
	}
	public String getLoanApplicationModel() {
		return LoanApplicationModel;
	}
	public void setLoanApplicationModel(String loanApplicationModel) {
		LoanApplicationModel = loanApplicationModel;
	}
}
