package com.class34Again;
import java.util.*;

public class PersonsTest {

	public static void main(String[] args) {
	// In Test Class create a Map to store personId and a Person Object. Print each object details. 	
	    
		//1.way
		Persons ps1=new Persons("Mika", "Sibalic", 37, 130000);	
		Persons ps2=new Persons("Milena", "Sibalic", 37, 110000);	
		ps1.printUserDetails();
		ps2.printUserDetails();
		
		//2.way:
		Map<Integer, Persons> mapPersons=new TreeMap<>();
	 //  mapPersons.put(101, ps1);
	 //  mapPersons.put(102, ps2);
		mapPersons.put(1, new Persons("Mika", "S",38,125000));
		mapPersons.put(2, new Persons("Miki", "Siki", 39, 13000));
		
		for(Persons per: mapPersons.values()) {
			per.printUserDetails();
		}
		
		
		
		
		
		
		
		
	}
}
