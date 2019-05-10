package com.ReviewClass11;
import java.util.*;

public class MarketingTest {
   // In your Test class have a collection of 10 marketing employees
   // and print those who achieved more than $3000 in sales. 
	public static void main(String[] args) {
	
	Map<Integer, Marketing> saleMap=new HashMap<>(); //creating Objects of type marketing
	
	saleMap.put(1, new Marketing("Joe", "shoes", 2000));
	saleMap.put(2, new Marketing("Smith", "shoes", 4000));
	saleMap.put(3, new Marketing("Adam", "shoes", 6000));
	saleMap.put(4, new Marketing("Jack", "shoes", 7000));
	saleMap.put(5, new Marketing("Aloha", "shoes", 1000));
	saleMap.put(6, new Marketing("Sam", "shoes", 20000));
	saleMap.put(7, new Marketing("Mick", "shoes", 8000));
	saleMap.put(8, new Marketing("Anne", "shoes", 3000));
	
	//Collection<Marketing> markvalues=saleMap.values();
	for(Marketing sale:saleMap.values()) {
		sale.printSale();
	}
	
	
	
	
	
	}
}
