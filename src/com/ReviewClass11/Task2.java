package com.ReviewClass11;

import java.util.Set;
import java.util.TreeSet;

public class Task2 {
	/*
     * Write a program to
     * In ascending order(smallest to the largest) print an element in a tree set which is greater than
     *       the given element 25 in ascending order.
     * Print all elements in descending order
     */
   public static void main(String[] args) {

	Set<Integer> set=new TreeSet<>();
	set.add(33);
	set.add(28);
	set.add(19);
	set.add(53);
	set.add(66);
	set.add(11);
	
	System.out.println("Printing elements which are greater than 25: ");
	for (Integer value:set) {
		if (value> 25) {
		System.out.println(value);
		}
	}
	
	Set<Integer> intRev=((TreeSet)set).descendingSet();
	 System.out.println("Before the reverse: "+set);
     System.out.println("After the reverse: "+intRev);
     
	
	
	
	
	
   }
}
