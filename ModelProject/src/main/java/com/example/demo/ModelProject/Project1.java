package com.example.demo.ModelProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	
	@Entity
	@Table(name="Carifo")
public class Model
	{
     @Id
     @Column(name="cid")
     private int cid;
     private String cname;
     private String cmodel;
     public int getCid()
     {
    	 return cid;
     }
     public void SetCid(int cid)
     {
    	 this.cid=cid;
     }
     pubic String getCname()
     {
    	 return cname;
     }
     public void setCname(String cname)
     {
    	 this.cname=cname;
     }
     public String getCmodel()
     {
    	 return cmodel;
     }
     public void setCmodel(String Cmodel)
     {
    	 this.cmodel = cmodel;
     }
	}
