package com.class23_2;

import com.class23.Employee;

public class WaterFallTeam extends Employee {

	
	public static void main(String[] args) {
		
		WaterFallTeam wt=new WaterFallTeam();
		wt.salary1=90000;  // can access PROTECTED members from different packages ONLY true inheritance!
	//	wt.salary;   //default members can not be access in different package
		wt.getPaid(); //we can access protect method
		
		wt.test(); //available cause it is protected
	//	wt.test1();// NOT available cuse it is default
		Employee.work();  //static
	}
	
	
	
	
	
	
}
