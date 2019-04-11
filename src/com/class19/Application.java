package com.class19;

public class Application {

	public static void main(String[] args) {
		
		Human person1=new Human();  //creating an objct of human class
		
		person1.print();
		person1.eyeColor="orange";
		person1.print();
		
		System.out.println(person1.eyeColor); // now we are getting same values from the human class
		System.out.println(person1.gender);   //this is just a copy, if we now change the values it will print new values
		System.out.println(person1.height);
		System.out.println(person1.weight);
		
		Human person2=new Human(); 
		
	//	person1.eyeColor="orange";
		
		System.out.println(person2.eyeColor); 
		System.out.println(person2.gender);   
		System.out.println(person2.height);
		System.out.println(person2.weight);
		
		person1.print();
	}
	
	
	
	
}
