package com.class21;

public class Employee {

   //Create a Class called Employee:
   //Create three  variables  eID , salary and set the CEO to “Sumair”
   //Create two objects of the class Employee
   //Set the value of eID, salary for each of the objects
   //Print out the eID , salary and  CEO for each of the objects
	
	
	 int eId;
	 double salary;
	
	public static String CEO="Sumair";
	
	public static void main(String[] args) {
		
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		
		emp1.eId=987;
		emp1.salary=70000;
		emp1.getInfo();
		
		emp2.eId=123;
		emp2.salary=80000;
		emp2.getInfo();
	}
	public void getInfo() {
		System.out.println("Employee's id is "+eId+", salary is "+salary+" and his ceo is "+CEO);
	}
	
}
