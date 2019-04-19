package com.class25;

public class AnimalTest {

	public static void main(String[] args) {
		
	Animal obj=new Monkey();
	obj.whoAmI();  //I am an animal -METHOD HIDING
	//(compiler do not give an error, but in real word using static method you are achieving method hiding)
	
	}
	
	
}
