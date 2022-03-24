package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Home {  
	//POJO Class
	
	private String owner;
	private int doorno;
	
	@Autowired
	@Qualifier("Ofc")
	private Office ofc;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	
	public void connect()
	{
		System.out.println("Print from Home Function");
		ofc.display();
	}
	
	
     
}  
