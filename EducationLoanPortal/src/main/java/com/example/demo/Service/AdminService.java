package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.AdminModel;
import com.example.demo.Model.LoanApplicationModel;
import com.example.demo.Model.LoginModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Repository.AdminRepo;
import com.example.demo.Repository.LoanApplicationRepo;
import com.example.demo.Repository.LoginRepo;
import com.example.demo.Repository.UserRepo;

	
	@Service
	public class AdminService 
	{
		@Autowired
		public UserRepo urepo;
		@Autowired
		public LoginRepo irepo;
		@Autowired
		public LoanApplicationRepo arepo;
		@Autowired
		public AdminRepo adrepo;
		
		//userModel
		//post
		public UserModel saveInfo(@RequestBody UserModel  obj)
		{
			return urepo.save(obj);
		}
		//get
		public List<UserModel> getInfo()
		{
			return urepo.findAll();
		}
		//put
		public UserModel UpdateInfo(UserModel obj1)
		{
			return urepo.saveAndFlush(obj1);
		}
		//delete
		public void deleteInfo(String Id)
		{
			urepo.deleteById(Id);
		}
		
		//loginModel
		//post
		public LoginModel saveInfo1(@RequestBody LoginModel  obj2)
		{
			return irepo.save(obj2);
		}
		//get
		public List<LoginModel> getInfo1()
		{
			return irepo.findAll();
		}
		//put
		public LoginModel UpdateInfo1(LoginModel obj3)
		{
			return irepo.saveAndFlush(obj3);
		}
		//delete
		public void deleteInfo1(String Email)
		{
			irepo.deleteById(Email);
		}
		
		//LoanApplicationModel
		//post
		public LoanApplicationModel saveInfo2(@RequestBody LoanApplicationModel  obj4)
		{
			return arepo.save(obj4);
		}
		//get
		public List<LoanApplicationModel> getInfo2()
		{
			return arepo.findAll();
		}
		//put
		public LoanApplicationModel UpdateInfo2(LoanApplicationModel obj5)
		{
			return arepo.saveAndFlush(obj5);
		}
		//delete
		public void deleteInfo2(int id)
		{
			arepo.deleteById(id);
		}
		
		//AdminModel
		//post
		public AdminModel saveInfo3(@RequestBody AdminModel  obj6)
		{
			return adrepo.save(obj6);
		}
		//get
		public List<AdminModel> getInfo3()
		{
			return adrepo.findAll();
		}
		//put
		public AdminModel UpdateInfo3(AdminModel obj7)
		{
			return adrepo.saveAndFlush(obj7);
		}
		//delete
		public void deleteInfo3(String Password)
		{
			adrepo.deleteById(Password);
		}
	}