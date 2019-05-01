package ReplTask;

import java.util.ArrayList;

public class Task147 {
	// Retrieve an element from a particular position of an ArrayList
	// Get() method returns an element from a specified position of an ArrayList.
	// This method takes index of the element as an argument.
	// Add the six Elements to the list 
	// 111
	// 222
	// 333
	// 444
	// 555
	// 666
    // By using get method call get 1, 3, 5
	
	public static void main(String[] args) {
		
	ArrayList<Integer> num=new ArrayList <Integer>();
	num.add(111);
	num.add(222); //index 1
	num.add(333); 
	num.add(444); //index 3
	num.add(555);
	num.add(666); //index 5
	
	System.out.println(num.get(1));
	System.out.println(num.get(3));
	System.out.println(num.get(5));
	
	
	
	
	
	}
}
