package ReplTask;

import java.util.ArrayList;

public class Task149 {
	// Remove an element from a particular position of an ArrayList?
	//	remove() method which takes int type as an argument is used to remove an element from a particular position of an ArrayList. remove the element at position 
	//	remove all elements of an ArrayList at a time?
    //	clear() method removes all elements of an ArrayList. ArrayList will be empty after this method is executed.
	//		add the below elements to the list
	//		111
	//		222
	//		333
	//		444
	//		555
	//		666

	public static void main(String[] args) {
		
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(111);
	list.add(222);
	list.add(333);
	list.add(444);
	list.add(555);
	list.add(666);
	
    list.remove(1);   //to remove an element from a specific position/index
    System.out.println(list);
	
	list.clear();    //removes all elements from an ArrayList []
	System.out.println(list);
	
	}
}
