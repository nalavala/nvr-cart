package com.Nvr.Backend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;
//import org.springmodules.validation.bean.conf.loader.annotation.handler.Min;
//import org.springmodules.validation.bean.conf.loader.annotation.handler.NotEmpty;

@Entity
public class Product 
{
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private int pid;
   
   @Transient
   MultipartFile pimage;
   
   
  // @Min(value=100,message="minimum value is 100")
   private int price;
  // @Min(value=100,message="minimum value is 100")
   private int stock;
   private int suppid;
   private int catid;
  // @NotEmpty(message="product name is mandatory")
   private String pname;
  // @NotEmpty(message="product name is mandatory")
   private String description;

   
   
   public MultipartFile getPimage() {
	return pimage;
}


public void setPimage(MultipartFile pimage) {
	this.pimage = pimage;
}





public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public int getPid() {
	return pid;
}


public void setPid(int pid) {
	this.pid = pid;
}


public int getCatid() {
	return catid;
}


public void setCatid(int catid) {
	this.catid = catid;
}


public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}


public int getSuppid() {
	return suppid;
}

public void setSuppid(int suppid) {
	this.suppid = suppid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}
   


}
