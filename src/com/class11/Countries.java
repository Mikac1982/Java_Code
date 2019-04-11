package com.class11;

public class Countries {
   public static void main(String[] args) {
	
	// Create an array of countries. 
	// While retrieving all values from an array print capital for each country. (use 2 different loops).  
	   
	String[] contry= {"Serbia", "France", "Spain", "Germany"};
	
	System.out.println("----------For loops------------");
		
	String capital = null;
	
	for (int i=0; i<contry.length; i++)  {
		
		if (contry[i].equals("Serbia")) {
			capital="Belgrade";
		}else if (contry[i].equals("France")) {
			capital="Paris";
		}else if (contry[i].equals("Spain")) {
			capital="Madrid";
		}else if (contry[i].equals("Germany")) {
			capital="Berlin";
		}
	System.out.println(capital);
	}
	
	System.out.println("-----------Each for loop------------");
	
	for (String countries:contry) {
		
	switch (countries)	 {
	
	case "Serbia":
		capital="Belgrade";
		break;
	case "France":
		capital="Paris";
		break;
	case "Spain":
		capital="Madrid";
		break;
	case "Germany":
		capital="Berlin";
		break;
	}
	System.out.println(capital);	
		
	}
		
  }
}
