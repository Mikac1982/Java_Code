package com.class24Again;

public class TestEmployee {
	
	public static void main(String[] args) {
		
	
   Employee emp=new Employee();
   FullTimeEmployee ft=new FullTimeEmployee();
   Contractor contractor=new Contractor();
   
   emp.getPaid();   // Employee gets paid salary
   ft.getPaid();    //Full time employee gets paid salary and bonus
   contractor.getPaid(); //Contactor gets paid salary

	} 
}
