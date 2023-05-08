package com.example.demo.chocolateService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.chocolateModel.chocoLoginModel;
import com.example.demo.chocolateRepository.LoginRepo;

@Service
public class LoginService {
	@Autowired
	private LoginRepo mrepo;
	
	public chocoLoginModel postdata(chocoLoginModel lmodel) {
		return mrepo.save(lmodel);
	}
	
	public List<chocoLoginModel>  getdata(){
		return mrepo.findAll();
	}
	
	
	public String checkLogin(String username,String password) {
		chocoLoginModel  user=mrepo.findByusername(username);
		if(user==null) {
			return "No User Found";
		}
		else {
			if(user.getPassword().equals(password)) {
				return "Login Successfull";
			}
			else {
				return "Login Failed";
			}
		}
	}
	
	
	public String resetPassword(String username, String Password, String newPassword)
	{
		chocoLoginModel  user = mrepo.findByusername(username);
		
		if(user == null)
		{
			return "No user found";
		}
		
		if(!user.getPassword().equals(Password))
		{
			return "Old password is incorrect";
		}
		
		user.setPassword(newPassword);
		mrepo.save(user);
		
		return "Password reset successful";
	}	
}