package com.example.demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.chacoModel;
import com.example.demo.Service.ChacoService;

@RestController
public class chacoControler
{
@Autowired
public ChacoService cser; 

@PostMapping("/ChocolateMenuideas")
public chacoModel addDetails(@RequestBody chacoModel mo)
{
	return cser.saveInfo(mo);
}
@GetMapping("/getChocolate")
public List <chacoModel> getDetails()
{
	return cser.getInfo();
}
@PutMapping("/updateChocolate")
public chacoModel updatedetails(chacoModel fg)
{
	return cser.updateInfo(fg);
}


}
