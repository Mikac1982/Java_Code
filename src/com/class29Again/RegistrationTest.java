package com.class29Again;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration obj=new Registration();
		obj.setEmail("sibalic.milena@gmail.com");
		obj.setUserName("Milena123");
		obj.setPassword("JavaCoding");
		
		System.out.println("User email: "+obj.getEmail());
		System.out.println("User name: "+obj.getUserName());
		System.out.println("User password: "+obj.getPassword());
	}
	
	
	
	
	
	
	
}
