package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
  // Create an arrayList of even numbers from 1 to 50.
  // Using Integer remove any number that is divisible by 5 from that arrayList.
	
	public static void main(String[] args) {
		
	ArrayList<Integer> listNum=new ArrayList<>();
	
	for (int i=2; i<=50; i+=2) {
			listNum.add(i);
		}
	Iterator<Integer> it=listNum.iterator();
	while(it.hasNext()) {
		int num=it.next();
		if(num%5==0) {
			it.remove();
		}
	}
	System.out.println(listNum);
	
	}	
}
