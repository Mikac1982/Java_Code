package com.class34Again;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarTest {

	public static void main(String[] args) {
	//Create a Map in which we will store the carNumber and Car Object itself	
	
	//creating an Object(,passing the values) and using reference variable accessing the methods	
	Car car1=new Car("Toyota","Corola");	
	Car car2=new Car("Honda","Accord");	
	Car car3=new Car("Lada","Priora");		
//	car1.printCarDetails();	
//	car2.printCarDetails();	
//	car3.printCarDetails();	
	
	//we are putting Object in a Map
	//as a value we store Object of a Car:
	Map<Integer, Car> carMap=new HashMap<>();	
	//carMap.put(1, car1);
	//carMap.put(2, car2);
	//carMap.put(3, car3);
	//creating an object and store it right away
	carMap.put(1, new Car("BMW","x8"));
	carMap.put(2, new Car("Audi","R*"));
	carMap.put(3, new Car("Mercedes", "cls"));
	
	              //collectionName
	Collection<Car> carValues=carMap.values();//inside collection we have Object type of Car
	for(Car car:carValues)	{  //variable car 
		car.printCarDetails();
		
	}
		
		
		
	}
}
