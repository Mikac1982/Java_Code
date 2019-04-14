package MethodsPractice;

public class JavaMethod11 {

   /* Write a Java method to check whether a string is a valid password
      Password rules:
      A password must have at least ten characters.
      A password consists of only letters and digits.
      A password must contain at least two digits.
   */
	
	public static void main(String[] args) {
		
		JavaMethod11 obj=new JavaMethod11 ();
		obj.isValidPassword("Heloohhj5");
			
	}
	
	
	public void isValidPassword(String str) {
		
		
		if (str.length()>=8) {
			
		   if ((str.replaceAll("[a-zA-Z0-9]", "")).length()==0) {
			
		     if ((str.replaceAll("[^0-9]", "")).length()>=2) {
		    	 System.out.println("String is a valid password");
		     }	 
		   } 
		  }	else {
	        	System.out.println("String is not a valid password");   
		}  
		
	}
  }