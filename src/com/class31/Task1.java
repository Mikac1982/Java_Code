package com.class31;
import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
   //Create an ArrayList of cars and retrieve all the values using 4 different ways
	
	public static void main(String[] args) {
		
		ArrayList<String> cars=new ArrayList<>();
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Mercedes");
		
		System.out.println("------For Loop-----");
		for (int i=0; i<cars.size(); i++) {
			System.out.print(cars.get(i)+" ");
		}
		System.out.println();
		System.out.println("-----Advance For Loop------");
		for (String car : cars) {
			System.out.print(car+" ");
		}
		System.out.println();
		
		System.out.println("-------Iterator-------");
		Iterator<String> it=cars.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		System.out.println("------While Loop------");
		
		int a=0; 
		while(cars.size()>a) {
			String car=cars.get(a);
			System.out.print(car+" ");
			a++;
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
