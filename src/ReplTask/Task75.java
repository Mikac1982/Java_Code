package ReplTask;

import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {
		
  // If browser is ChRoME
  // It should print the 
  // Proceed with chrome Browser
  // If browser is FireFOX
  // It should print the 
  // Proceed with firefox Browser
  // If browser is Ie
  // It should print the 
  // Proceed with ie Browser
  // If any other browser 
  // It should print the  
  // Invalid Browser
  	
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter the browser name to proceed further with execution");
     String browser = sc.nextLine(); 	
     String print;
     
    	 
    	 if (browser.equalsIgnoreCase("ChRoME"))  {
    		 print=" Proceed with chrome Browser";
    	 }else if (browser.equalsIgnoreCase("FireFOX")) {
    		 print=" Proceed with firefox Browser";
    	 }else if (browser.equalsIgnoreCase("Ie"))  {
    		 print="Proceed with ie Browser";
    	 
    	 }else {
    	     print="Invalid Browser";
    	 }
       
    	System.out.println(print); 
 	
	}
}
