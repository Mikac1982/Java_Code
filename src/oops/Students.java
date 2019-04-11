package oops;

public class Students {

	//String name;   //instance variable (outside of method)
	//int age;       //variables are independant from each other from one to another object
	
	public String name;
	public int age;
	public static int numStudents=0;   //STATIC VARIABLE- shared by all the objects(instances) created from the class
	                   //we can access static variables without creating an object from the class
	
	public Students()	{ //constructor
		numStudents++;
	    System.out.println("This is the "+numStudents+" object created from this class");	
	}
	
	public static void howManyStudents() {   //static method
		System.out.println("There are "+numStudents+" students");
	//	Students(); static method can not access non-static method
	}
	
	public void introduce() {
		System.out.println("Hey i am "+name+" and i am "+age+" years old");
		howManyStudents(); //calling static method from the same class
	}
	
	
	
	
	
	
}
