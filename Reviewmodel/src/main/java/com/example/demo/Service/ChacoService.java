package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.chacoModel;
import com.example.demo.Repository.chacoRepository;

@Service
public class ChacoService 
{
		@Autowired
	public chacoRepository crepo;
		
	public chacoModel saveInfo(chacoModel c)
	{
		return crepo.save(c);
	}
	public List<chacoModel> getInfo()
	{
		return crepo.findAll();
	}
	public chacoModel updateInfo(chacoModel iu)
	{
		return crepo.saveAndFlush(iu);
	}
	public void deleteInfo(int id)
	{
		crepo.deleteById(id);
	}
}
