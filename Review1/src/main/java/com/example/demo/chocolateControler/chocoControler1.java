package com.example.demo.chocolateControler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.chocolateModel.chocoModel1;
import com.example.demo.chocolateRepository.chocoRep1;
import com.example.demo.chocolateService.chocoService1;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/Choco")
public class chocoControler1
{
@Autowired
	public chocoService1 cser; 

	@PostMapping("/ChocolateMenuideas")
	public chocoModel1 addDetails(@RequestBody chocoModel1 mo)
	{
		return cser.saveInfo1(mo);
	}
	
	@GetMapping("/getChocolate")
	public List <chocoModel1> getDetails()
	{
		return cser.getInfo();
	}
	
	@PutMapping("/updateChocolate")
	public chocoModel1 updatedetails(@RequestBody chocoModel1 id)
	{
		return cser.updateInfo(id);
	}
	
	@DeleteMapping("/deleteChocolate/{cid}")
	public String deleteDetails(@PathVariable ("cid") int id)
	{
		cser.deleteInfo(id);
		return "Chocolate Number "+id+"is deleted";
	}
	
	@DeleteMapping("/deleteByReq")
	public String deleteByRequestPara (@RequestParam("cid") int id)
	{
		cser.deleteInfo(id);
		return "Chocolate Number"+id+" is deleted";
	}
//	@GetMapping("/sortDes/{id}")
//	public List<chocoModel1> sortPlayer(@PathVariable("id") String id)
//	{
//		return (List<chocoModel1>) cser.sortDesc(id);
//	}
	@Autowired
	public chocoRep1 ir;

	@Tag( name="Native query",description="Getting details")
	@GetMapping("/saveir")
	public List<chocoModel1> getD()
	{
		return ir.getAllData();
	}

	@Tag( name="Native query",description="Getting details by id")
	@GetMapping("/byName/{pid}")
	public List<chocoModel1> getName(@PathVariable ("pid") int pid )
	{
		return ir.byid(pid);
	}

	@Tag( name="Native query",description="Getting details by start end method")
	@GetMapping("startend/{start}/{end}")
	public List<chocoModel1> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
	{
		return ir.startEnd(start, end);
	}

	@Tag( name="Native query",description="Deleting details by id and name")
	@DeleteMapping("/del/{id}/{name}")
	public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
	{
		ir.deleteD(id, name);
		return "deleted";
	}

	@Tag( name="Native query",description="Posting details")
	@PutMapping("updatee/{pid}/{pname}")
	public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
	{
		ir.updateByQuery(pid, pname);
	}

	@Tag( name="JPQL",description="Getting details by methods")
	@GetMapping("jp")
	public List<chocoModel1> jplQuery()
	{
		return ir.jpqlQ();
	}

	@Tag( name="JPQL",description="Getting details by id")
	@GetMapping("/upp/{id}")
	public List<chocoModel1> jpqUp(@PathVariable ("id") int id)
	{
		return ir.jqBYCon(id);
	}
	}