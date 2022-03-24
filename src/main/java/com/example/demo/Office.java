package com.example.demo;

import org.springframework.stereotype.Component;

@Component("Ofc")
public class Office {
	
	public void display() {
		System.out.println("Print from Office - Display function");
	}

}
