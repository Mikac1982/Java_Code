package com.class21;

public class Students {

	//Create a Class called Student
    // Create three  variables  studentName , studentID  and  numberOfStudents
    // Create three objects of the Students Class
    // Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    // Print out  total number of students
	
	String studentName;
	int studentID;
	public static int numberOfStudents;
	
	public static void main(String[] args) {
		
	    Students student1=new Students ();
	    Students student2=new Students ();
	    Students student3=new Students ();
	
	    student1.studentName="Christina";
	    student1.studentID=1234;
	    numberOfStudents++;
	
	    student2.studentName="Jennifer";
	    student2.studentID=5678;
	    numberOfStudents++;
	
	    student3.studentName="Britny";
	    student3.studentID=9012;
        numberOfStudents++;
    
       System.out.println("Total number of students is "+numberOfStudents);
	
	
	}	
}
