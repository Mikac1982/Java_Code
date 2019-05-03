package com.ReviewClass10;

public class StaffPersonTest {
	
   public static void main(String[] args) {
	
	 Profesor p1=new Profesor("John", "123 calorama", 90000);
	 Profesor p2=new Profesor("Anna", "22 new avenue", 93000);  
	 Profesor p3=new Profesor("Marta", "333 columbia rd", 88000);  
	   
	  Secretarys s1=new Secretarys("Mina", "11 nebrh", 99000); 
	  Secretarys s2=new Secretarys("Marko","dositejeva 44", 96000); 
	   
	   
	   int totalSalary=p1.salary+p2.salary+p3.salary+s1.salary+s2.salary;
	   System.out.println("Total salary of all emplyes is "+totalSalary);
	   
	   
  } 
}
