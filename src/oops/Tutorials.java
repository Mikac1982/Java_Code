package oops;

public class Tutorials {

	public static void main(String[] args) {
		

	System.out.println(Students.numStudents);  // 0 by default
		
	Students anil=new Students();
	Students shreesh=new Students();
	
	anil.name="Anil";  //initializing instance variable of anil object
	anil.age=24;
	
	shreesh.name="Shreesh";
	shreesh.age=25;
	
	anil.introduce();
	shreesh.introduce();
	
	Students.howManyStudents();  //calling static method from another class (classname.methodname)
	                             //there are 2 students
	
	
	}
	
	
	
	
	
}
