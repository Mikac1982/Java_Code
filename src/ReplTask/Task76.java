package ReplTask;

public class Task76 {
/*Create a class named 'Main' with String variable 'name' and integer variable 'roll_no'. 
  Creating an object of the class Main and assign value of 2 to roll_no and name as "John"
  Your program should print the following:
  Name is John and roll number is 2
 */
	String name;
	int roll_no;
	
	public static void main(String[] args) {
		
	Task76 first=new Task76();
	
	first.name="John";
	first.roll_no=2;
	System.out.println("Name is "+first.name+" and roll numbr is "+first.roll_no);
	
	first.print();
		
	}
	void print() {
		
	}
}
