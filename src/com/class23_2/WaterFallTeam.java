package com.class23_2;

import com.class23.Employee; //when class is in different package we have to IMPORT it

public class WaterFallTeam extends Employee {

	
	public static void main(String[] args) {
		
		WaterFallTeam wt=new WaterFallTeam();
		
		wt.salary1=90000;  //we CAN access PROTECTED members from DIFFERENT packages ONLY true inheritance!
	 // wt.salary;   //DEFAULT members can NOT be access in different package
		wt.getPaid(); //we can access protect method
		
		wt.test();    // available cause it is protected
	//	wt.test1();   // NOT available cause it is default
		Employee.work();  //accessing static method (through className)
		System.out.println(Employee.department); //accessing static variable (through className)
	}
	
	
	
	
	
	
}
