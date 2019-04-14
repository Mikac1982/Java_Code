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
	public String studentName;     //=Asha
	public String studentLastName; //=Noman
	
	//CONSTRACTOR with parameters -we use this to pass the values into instance variables
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
