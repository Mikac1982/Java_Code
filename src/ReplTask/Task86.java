package ReplTask;

import com.class3.Main;

public class Task86 {

/*Create three method with  Multiple Parameters as int 
  and write the logic in that method to perform multiplication,addition and subtraction
  and call the method in main method with values 

  1. for the addition method add two numbers to make 30 but put those numbers in the parameters
  2. for multiplication multiply two numbers to make 30 but put those two numbers in your parameters
  3. for Subtraction subtract two numbers to equal 20, with using parameters.
    30 for addition
    30 for multiplication
    20 for subtraction
 */
	
	public static void main(String[] args) {
		
		Task86 obj=new Task86();
		System.out.println(obj.add(20, 10));
		System.out.println(obj.mult(2, 15));	
		obj.sub(30, 10);
	}
	int add(int a,int b) {
		int add=a+b;
		return add;
	}
	int mult(int a, int b) {
		int mult=a*b;
		return mult;
	}
	void sub(int a,int b) {
		int sub=a-b;
		System.out.println(sub);
	}
	
	
	
	}
