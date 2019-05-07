package com.class34Again;

import java.util.ArrayList;
import java.util.*;

public class CollectionRecap {

	public static void main(String[] args) {
	
		//LIST INTERFACE
	List<String> list=new ArrayList<>();
	list.add("java");
	list.add("is");
	list.add("fun");
	System.out.println(list); //[java, is, fun]
	
	List<String> llist=new LinkedList<>();
	llist.add("java");
	llist.add("is");
	llist.add("fun");
	System.out.println(llist);	
	System.out.println(llist.get(2)); //fun
	
	   //SET INTERFACE
	Set<String> hset=new HashSet<>(); //does Not preserve the order
	hset.add("java");
	hset.add("is");
	hset.add("fun");
	hset.add("and");
	hset.add("logic based");
	System.out.println(hset);  //[java, and, is, fun, logic based]
		
	Set<String> lset=new LinkedHashSet<>(); //preserves the order
	lset.add("java");
	lset.add("is");
	lset.add("fun");
	lset.add("and");
	lset.add("logic based");
	System.out.println(lset); 	//[java, is, fun, and, logic based]
		
	Set<String> tset=new TreeSet<>(); //sort based on values (A-Z, 0-9)
	tset.add("java");
	tset.add("is");
	tset.add("fun");
	tset.add("and");
	tset.add("logic based");
	System.out.println(tset);  //[and, fun, is, java, logic based]
	
	
	
	
	}
}
