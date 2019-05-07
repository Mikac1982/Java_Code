package com.class34Again;
import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
	
	//storing object from your custom class to the Map	
	Map<Integer, Person> mapPerson=new TreeMap<>();	
	mapPerson.put(101, new Person("Milena", "Siblic", 37, 110000));
	mapPerson.put(102, new Person("John", "Smith", 44, 99000));	
	mapPerson.put(103, new Person("Eric", "Jackson", 33, 104000));
	
	//Collection<Person> personVal=mapPerson.values();
	
	//using for each loop
	for(Person person: mapPerson.values()) {
		person.printUserDetails();
	}
	
	//using iterator
	Iterator<Person> it=mapPerson.values().iterator();
	while(it.hasNext()) {
		it.next().printUserDetails();
	}
		
		
		
	}
}
