package com.class22;

public class Students {

	/* Write a java program of Class Students that takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade.
	 * Test Student class for 5 different students with different marks. 
	 * Your program should print an average mark of each students name.
	 * 
       NOTE: please make different names for instance and local variables.
   */
	
	public String studentName;
	
	 int subGrade1;
	 int subGrade2;
	 int subGrade3;
	 
	public void getAverageGrade(String name,int grade1,int grade2,int grade3) {
		
		 studentName=name;
		 subGrade1=grade1;
		 subGrade2=grade2;
		 subGrade3=grade3;
		 
		 int averageGrade=(subGrade1+subGrade2+subGrade3)/3;
		 System.out.println("The average mark of a student "+studentName+" is "+averageGrade);
	}
	
	public static void main(String[] args) {
		
		Students student1=new Students();
		student1.getAverageGrade("Milena", 61, 57, 43);
		
		Students student2=new Students();
		student2.getAverageGrade("Farrah", 49, 70, 50);
		
		Students student3=new Students();
		student1.getAverageGrade("Lola", 80, 36, 41);
		
		Students student4=new Students();
		student1.getAverageGrade("Zaki", 56, 73, 56);
		
		Students student5=new Students();
		student1.getAverageGrade("Samir", 66, 44, 61);
		
		
		
		
		
	}
	
}
