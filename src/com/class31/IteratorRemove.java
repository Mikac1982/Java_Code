package com.class31;

	import java.util.ArrayList;
	import java.util.Iterator;

	public class IteratorRemove {

		public static void main(String[] args) {
			
		//let's create an arrayList of integers from 1 to 20	
		//remove all odds using iterator	
			
		ArrayList<Integer> alist=new ArrayList<>();	
		//alist.add(1);
		//alist.add(2);
		//alist.add(3);
		
		for (int i=1; i<=20; i++) {
			alist.add(i);
		}
		System.out.println(alist);	//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
			
		Iterator<Integer> it=alist.iterator(); //will return one object from Iterator?
		while(it.hasNext()) {      //if it's true
			int number=it.next();  //return next element, then check again
			if (number%2!=0) {     //if number is odd, remove it
				it.remove();
			}
		}
		System.out.println(alist); //[2, 4, 6, 8, 10]
		
		
		
		
		
		}	
	
	
}
