package com.GroupTasks;

public class TestRegistration {

	public static void main(String[] args) {
		
		Registration obj=new Registration();
		obj.setEmail("sibalic.milena@gmail.com");
		obj.setUserName("Milenaaaa");
		obj.setPassword("codingDay");
		
		System.out.println(obj.getEmail());
		System.out.println(obj.getUserName());
		System.out.println(obj.getPassword());
		
		
	}
	
	
	
	
}
