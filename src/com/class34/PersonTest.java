package com.class34;
import java.util.*;
public class PersonTest {

	public static void main(String[] args) {
	
		//storing object from your custom class to the Map
	Map<Integer, Person> personMap=new LinkedHashMap<>();	
	personMap.put(101, new Person("John", "Smith", 33, 99000));	//storing Object as a value
	personMap.put(102, new Person("Mike", "Adams", 23, 80000));	
	personMap.put(103, new Person("Britney", "Spirs", 37, 1000000));	
	
//	Collection<Person> perValues=personMap.values();
//	for(Person info:perValues)	{
//		info.printUserDetails();
//	}
	
	//we are looping true the values cause our object is store in values
	for (Person details:personMap.values()) {
		details.printUserDetails();
	}
		
		
		
		
		
		
	}
}
