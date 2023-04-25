package com.example.demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Model;
import com.example.demo.Service.ChacoService;

@RestController
public class Controler
{
@Autowired
public ChacoService cser; 

@PostMapping("/ChocolateMenuideas")
public Model addDetails(@RequestBody Model mo)
{
	return cser.saveInfo(mo);
}
@GetMapping("/getChocolate")
public List <Model> getDetails()
{
	return cser.getInfo();
}
@PutMapping("/updateChocolate")
public Model updateDetails(@RequestBody Model chocolatenum)
{
	return cser.updateInfo(chocolatenum);
}
}
