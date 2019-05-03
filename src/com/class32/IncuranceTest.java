package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IncuranceTest {

	public static void main(String[] args) {
		
	Insurance obj1=new Car("Geico","BMW");
	
	Insurance obj2=new Pet("Progresive", "cat");	
		
	Insurance obj3=new Health("Kaiser");
		
	ArrayList<Insurance> alist=new ArrayList<>();
	alist.add(obj1);
	alist.add(obj3);
	alist.add(obj3);
	
	//advanced loop
	for (Insurance ins:alist) {
		System.out.println(ins.insuranceName);
		ins.getQuote();
	  //ins.cancelInsurance();
	}
	//for loop
	for (int i=0; i<alist.size(); i++) {
		System.out.println(alist.get(i).insuranceName);
	}
		
	//iterator
	Iterator<Insurance> it=alist.iterator();
	while(it.hasNext()) {
		Insurance i=it.next();
		i.cancelInsurance();
		
	}
		
		
	}
	
	
	
	
	
	
}
