package com.example.demo.chocolateControler;
	import java.util.List;
	import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.demo.chocolateModel.chocoLoginModel;
	import com.example.demo.chocolateService.LoginService;

	@RestController
	@RequestMapping("/user")
	public class LoginController
	{
		@Autowired
		private LoginService mserv;
		
		@PostMapping("/postlogin")
		
		public chocoLoginModel add(@RequestBody chocoLoginModel mmodel) {
			return mserv.postdata(mmodel);
		}
		
		@GetMapping("/getlogin")
		
		public List<chocoLoginModel> getdetails(){
			return mserv.getdata();
		}
		
		@PostMapping("/checklogin")
		public String log(@RequestBody Map<String,String> logindata)
		{
			String username=logindata.get("username");
			String password=logindata.get("password");
			String result=mserv.checkLogin(username, password);
			return result;
		}
		
	    @PostMapping("/forget")
		
		
		public String resetPassword(@RequestBody Map<String,String> resetData)
		{
			String username = resetData.get("username");
			String Password = resetData.get("Password");
			String newPassword = resetData.get("newPassword");
			
			String result = mserv.resetPassword(username, Password, newPassword);
			
			return result;
		}
	}