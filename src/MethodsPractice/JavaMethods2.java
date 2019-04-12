package MethodsPractice;

public class JavaMethods2 {
	//Write a Java method to compute the average of three numbers.
	
	
   public static void main(String[] args) {
	
	   JavaMethods2 obj=new JavaMethods2();
	   System.out.println("The average of 3 numbers is "+obj.isAverage(25, 45, 5));
	     
   }	
	
	int isAverage(int a,int b,int c) {
		
		return (a+b+c)/3;
	}
	
	
	
	
	
	
	
}
