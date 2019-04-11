package com.class20;

public class Task {

	/* Create a method createEmail().
         * Based on provided users name, lastName and email type,
         * your method should return complete email Address;
         * johnsnow@gmail.com
         * johnsnow@yahoo.com
	 */
	public static void main(String[] args) {

		Task obj=new Task();
		
		String email=obj.createEmail("Milena", "Sibalic", "gmail");
		System.out.println(email);
		//System.out.println(obj.createEmail("milena", "sibalic", "gmail"));
		
	    email=obj.createEmail("Bob", "Snow", "outlook"); //here we reassigning the value(we do not need String again)
		System.out.println(email);
	}
  //return type+methodName
	String createEmail(String name,String lastName, String emailType){
		
		 String email= name+lastName+"@"+emailType+".com";
		 return email.toLowerCase();
	}
	
	
	
	
	
	
	
	
}
