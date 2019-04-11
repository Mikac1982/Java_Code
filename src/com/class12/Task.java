package com.class12;

import java.util.Scanner;

public class Task {
   public static void main(String[] args) {
	
	   
	    Scanner scan;
	    String userName, password, confirmedPass;
	    
	    scan=new Scanner(System.in);
	    System.out.println("Please enter your username");
	    userName=scan.nextLine();
	    System.out.println("Please enter your password");
	    password=scan.nextLine();
	    System.out.println("Please confirm password");
	    confirmedPass=scan.nextLine();
	    
	    if (!userName.isEmpty() && !password.isEmpty())  {  // 1 checkpoint
	    	
	    	if (password.length()>=8) {                      // 2 checkpoint
	    		
	    	   if (!password.contains(userName)) {           // 3 checkpoint
	    			
	    	        if (password.equals(confirmedPass)) {    // 4 checkpoint
	    				System.out.println("Your username and password has been created");
	    			}else {
	    				System.out.println("Password do not match");
	    			}	
	    		}else {
	    			System.out.println("Password cannot contain username");
	    		}	
	    	}else {
	    	   System.out.println("Password is too short");	
	    	}
	    }else {
	    	System.out.println("Username and password cannot be empty");
	    }
	      
	   
	   
	   
}
}
