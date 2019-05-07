package com.class34;
import java.util.*;
public class CarTest {

	public static void main(String[] args) {
	//Create a map in which we will store the carNumber	
	//and Car Object itself	
	
		//1.way
//	Car car1=new Car("Toyota", "Corolla");
//	Car car2=new Car("Honda", "Accord");
//	Car car3=new Car("Lada", "Priora");
//	car1.printCarDetails();
//	car2.printCarDetails();
//	car3.printCarDetails();
	
		//2. way-shorter, faster way
		//storing objects this way
	Map<Integer, Car> carMap=new HashMap<>();
	carMap.put(1, new Car("BMW", "x8"));  
	carMap.put(2, new Car("Audi", "R8"));
	carMap.put(3, new Car("Mercedes", "cls"));
//	carMap.put(1, car1);
//	carMap.put(2, car2);
//	carMap.put(3, car3);
	
	Collection<Car> carValues=carMap.values();
	for (Car car:carValues) { //object of type of Car
		car.printCarDetails();
	}
	
	
	
	
	
	
	}
}
