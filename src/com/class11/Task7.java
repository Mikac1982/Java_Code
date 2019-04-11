package com.class11;

public class Task7 {
    public static void main(String[] args) {
		
    // Create an array of countries: 
    // north america countries, south america countries, europe countries, asian countries, african countries.
    // Then print all values from that array.
    	
    String[][] country= {
    		{"Nort America: ", "Canada","Mexico","Usa"},
    		{"South America: ","Brazil","Argentina","Peru","Chile"},
    		{"Europe: ","Serbia","Italy","Spain","Germany","France"},
    		{"Africa: ","Kenya","Nigeria","Ghana"}
    };
    System.out.println("--------For loop----------");	
    for (int i=0; i<country.length; i++)	{
    	
   	for (int y=0; y<country[i].length; y++) {
    		System.out.print(country[i][y]+" ");
    	}
    	System.out.println();
    }
    System.out.println("-----------For Each Loop------------");
   
    for (String[] countries:country) {
    	
    	for (String names:countries) {
    		System.out.print(names+" ");
    	}
    	System.out.println();
    }
    	
	}
}
