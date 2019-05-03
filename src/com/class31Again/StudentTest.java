package com.class31Again;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		
	Student student1=new Student("John", 101);	 //creating objects (Student)
	//student1.printStudentdetails();
//	System.out.println(student1.name);
	Student student2=new Student("James", 102);
	Student student3=new Student("Anna", 103);
	Student student4=new Student("Katy", 104);
		
	ArrayList<Student> alist=new ArrayList<>();
	alist.add(student1);  //we stored these student objects
	alist.add(student2);
	alist.add(student3);
	alist.add(student4);
	
	//using advanced loop we can access all these objects
	for (Student student : alist) {
		//student.printStudentdetails();  //to get everything
		System.out.println(student.name); //to get just names
	}	
	
	Iterator<Student> it=alist.iterator();
	while(it.hasNext())	{
		Student obj=it.next();  //returns 1 Object Student
		obj.printStudentdetails(); //no need for syso cause we calling the method
	}
	
		
	}
}
