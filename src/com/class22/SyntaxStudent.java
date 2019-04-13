package com.class22;

public class SyntaxStudent {

	/* schoolName
	 * batchNumber
	 * studentName
	 * studentLastName
	 * 
	 * method getStudentDetails
	 */
	
	//static variables
	public static String schoolName="Syntax";
	public static int batchNumber=4;
	
    //instance variables (not initialized)
	public String studentName;
	public String studentLastName;
	
	//CONSTRACTOR with parameters
	public SyntaxStudent(String name, String lastName) {
		studentName=name;
		studentLastName=lastName;
	}
	
	public void getStudentDetails() {
		
		String details="I am a student at "+schoolName+" from batch "+batchNumber+
				" and my name is "+studentName+" "+studentLastName;
		System.out.println(details);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
