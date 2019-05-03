package com.ReviewClass10;
   /* A university department consists of professors and secretaries. 
    * Each professor and each secretary has a name, a salary, and a hire date. 
    * Use inheritance and polymorphism to create an application that represents the department 
    *   and its professors and secretaries as objects, and provides a test class that creates 3 professors and 2 secretaries, 
    *   and then outputs the combined total of all of their salaries.
    * */
public abstract class StaffPerson {
	String name;
	String address;
	int salary;
	String vehicleType;
	String hireType;
	
	public StaffPerson(String name, String address, int salary) {
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
}
class Secretarys extends StaffPerson{

	public Secretarys(String name, String address, int salary) {
		super(name, address, salary);
		
		System.out.println(name+" "+address+" "+salary);
	}
} 
class Profesor extends StaffPerson{

	public Profesor(String name, String address, int salary) {
		super(name, address, salary);
		
		System.out.println(name+" "+address+" "+salary);
	}
	
	
}