package com.class29Again;

public class StudentTest {

	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.setName("Alex");
		obj.setAge(17); //compiler gives default value 0 because we didn't pass validation/condition
		
		System.out.println(obj.getName()+" "+obj.getAge());
		
	}
	
	
	 
	
	
	
	
}
