package oops;

import fruits.*;  //we are importing all the classes from the package fruits(now we can access apple class)

public class Tutorial {

	public static void main(String[] args) {  //main  method can be accessible from everywhere (public)
		
	//	Apple a=new Apple();  //creating an object of Apple class
	//	a.color="red";    //we have error bcs Apple class has default access modifier(available just inside package)
	//	a.whichColor();   //even though variable and method are public we can not access them bcs class is default level
		
		Person mika=new Person(); //creating an object of Person class
		mika.name="mika";         //initialazing name 
		mika.introduce();         //calling the method
		
		
		Student anil=new Student();
	//	anil.name="Mika";  not possible to access because variable name is private!
		
		anil.setName("Anil");  //Name is Anil and age is 24
		anil.age=24;
		
		System.out.println("Name is "+anil.getName());
		
	//	anil.doSomething(); we can not call this method it is private
		anil.introduce();
		
	}
	
	
	
	
	
}
