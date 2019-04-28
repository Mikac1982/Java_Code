package ReplTask;

//Create abstract class as parent. Create two abstract methods   
//Extends the abstract class with main class and provide the implementation for abstract methods
//which are declared in the parent class
//In main method by creating the object on main class with parent class instance and call those 
//two methods in the main method 

public class Task134 extends Parent {

	@Override
	public void method1() {
		 System.out.println("abstract method1 implementation in main class");
	}

	@Override
	public void method2() {
		 System.out.println("abstract method2 implementation in main class");
	}

	public static void main(String[] args) {
		
	
	 Parent obj=new Task134();
	obj.method1();
	obj.method2();
	
	}	
}
abstract class Parent{
	 public abstract void method1();
	 public abstract void method2();
	
	
	
}