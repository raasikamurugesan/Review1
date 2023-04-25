package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Model {
  @Id
  @Column(name="candymenu")
  private int chocolatenum;
  private String chocolatename;
  private String price;
public int getChocolatenum() {
	return chocolatenum;
}
public void setChocolatenum(int chocolatenum) {
	this.chocolatenum = chocolatenum;
}
public String getChocolatename() {
	return chocolatename;
}
public void setChocolatename(String chocolatename) {
	this.chocolatename = chocolatename;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
  
  
}
