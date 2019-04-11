package com.class20;

public class TaskAgain {

	/* Create a method createEmail().
         * Based on provided users name, lastName and email type,
         * your method should return complete email Address;
         * johnsnow@gmail.com
         * johnsnow@yahoo.com
	 */
	
	String createEmail(String name,String lastName,String emailType) {
		
		String email=name+lastName+"@"+emailType+".com";
		return email.toLowerCase();
	}
	
	public static void main(String[] args) {
		
		TaskAgain obj=new TaskAgain ();
		
		String email=obj.createEmail("Milena", "Sibalic", "gmail");
		System.out.println(email);
	}
	
	
	
	
	
	
	
}
