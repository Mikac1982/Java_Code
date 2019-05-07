package com.class34;
import java.util.*;

public class CollectionRecap {

	public static void main(String[] args) {
	//LIST:
		List<String> alist=new ArrayList<>();	
		alist.add("Java");
		alist.add("is");
		alist.add("fun");	
		System.out.println(alist); //[Java, is, fun]
		
	List<String> list=new LinkedList<>();	
	list.add("Java");
	list.add("is");
	list.add("fun");	
	System.out.println(list); // [Java, is, fun]
	System.out.println(list.get(2)); //fun
	
	//SET:
	Set<String> set=new HashSet<>();	
	set.add("Java");
	set.add("is");
	set.add("fun");
	set.add("and");
	set.add("logic based");
	System.out.println(set); //[Java, and, is, fun, logic based]
	
	Set<String> lset=new LinkedHashSet<>();	
	lset.add("Java");
	lset.add("is");
	lset.add("fun");
	lset.add("and");
	lset.add("logic based");
	System.out.println(lset); //[Java, is, fun, and, logic based]

	Set<String> tset=new TreeSet<>();	
	tset.add("java");
	tset.add("is");
	tset.add("fun");
	tset.add("and");
	tset.add("logic based");
	System.out.println(tset); //[and, fun, is, java, logic based]
	
	
	}
}
