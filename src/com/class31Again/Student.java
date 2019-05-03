package com.class31Again;

public class Student {

   public String name;
   public int studentId;
   
	public Student(String name, int studentId){  //constructor
		this.name=name;
		this.studentId=studentId;
	}
	
	public void printStudentdetails() {
		System.out.println(name+" "+studentId); //method
	}
	
	

}
