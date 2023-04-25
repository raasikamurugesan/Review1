package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Model;
import com.example.demo.Repository.Repository;

@Service
public class ChacoService 
{
		@Autowired
	public Repository crep;
	public Model saveInfo(Model c)
	{
		return crep.save(c);
	}
	public List<Model> getInfo()
	{
		return crep.findAll();
	}
	public Model updateInfo(Model iu)
	{
		return crep.saveAndFlush(iu);
	}
	public void deleteInfo(int chocolatenum)
	{
		crep.deleteById(chocolatenum);
	}
}
