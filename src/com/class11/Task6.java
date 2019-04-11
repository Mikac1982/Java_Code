package com.class11;

public class Task6 {
   public static void main(String[] args) {
	
	// Create an array of cars: american cars, german cars, korean cars, italian cars.    
	// Then retrieve all values from that array   
	   
	String[][] cars= {
			{"Ford","Fiat","General Motors"},
			{"BMW","Porche"},
			{"Hundai","Cheverlot", "Kia"},
			{"Maserati","Lamborghini","Pagani","Alfa Romeo"}
	};
	System.out.println("-------------For loop----------");
	for (int i=0; i<cars.length; i++) {
		
		for (int y=0; y<cars[i].length; y++) {
			System.out.print(cars[i][y]+" ");
		}
		System.out.println();
	}
	System.out.println("----------For Each Loop----------");
	
	for (String[] type:cars)  {          // loop true each single array and print all the elements !
		
		for (String car:type) {
			System.out.print(car+" ");
		}
		System.out.println();

	}
	   
}
}
