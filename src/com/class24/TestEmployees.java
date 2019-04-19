package com.class24;

public class TestEmployees {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		FullTimeEmployee ft=new FullTimeEmployee();
		Concractor con=new Concractor();
		
		emp.getPaid();  //Employee gets paid
		ft.getPaid();   //Full time employee gets paid salary + bonus
		con.getPaid();  //Contractor gets paid hourly
	}
	
	
	
}
