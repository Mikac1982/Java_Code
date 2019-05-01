package ReplTask;

import java.util.ArrayList;

public class Task146 {

//	find out whether the given ArrayList is empty or not
//	isEmpty(); method of ArrayList is used to check whether the given ArrayList is empty or not. This method returns true
//	 if an ArrayList contains no elements otherwise returns false.
//	Without adding the numbers to the list call isEmpty method
//	after adding the one or two numbers to the list call isEmpty Method	
	
	
	public static void main(String[] args) {
		
	ArrayList <Integer>	num=new ArrayList();
	System.out.println(num.isEmpty());
		
	num.add(3);
	num.add(33);
	System.out.println(num.isEmpty());
	}
	
	
	
	
	
	
}
