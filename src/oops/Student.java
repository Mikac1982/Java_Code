package oops;

public class Student {

	//private Student() {  //PRIVATE CONSTRUCTOR- you can not use student class to create an object in other class	
	//}
	//public Student(String name) {	
	//}
	
	
	private String name;  //only available inside the same class (private variable)
	public int age;
	
		
	public void setName(String iname) {  // we can access private var name by creating and calling this method
		name=iname;
	}
	
	public String getName() {  //PUBLIC methods that are used to access PRIVATE members of the class
		return name;
	}
	
	private void doSomething() {         //private method
		System.out.println(name+" is doing something");
	}
	
	void introduce() { //we are using this method to access private method doSomething
		doSomething();     //Anil is doing something
		System.out.println("Name is "+name+" and age is "+age); //Name is Anil and age is 24
	}

	
	
	
	
}
