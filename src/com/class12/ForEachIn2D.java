package com.class12;

public class ForEachIn2D {
   public static void main(String[] args) {
	
	// Create a grocery list: fruits {}
	//                        veggies {}
	//                        dairy {}
	// Retrieve all values using 2 different loops
	   
	 String[][] grocery= {  
			    {"bannana", "apple", "pear"},
			    {"potatos","tometoes","cabbage"},
			    {"cheese","milk","butter"}
	 };
	 System.out.println("----------For each loop-----------");  
	 for (String[] list:grocery)  {
		 
		 for (String items:list) {
			 System.out.print(items+" ");
		 }
		 System.out.println();
	 } 
	 System.out.println("---------For loop-----------"); 
	 
	 for (int i=0;i<grocery.length; i++) {
		 
		 for (int y=0; y<grocery[i].length; y++) {
			 System.out.print(grocery[i][y]+" ");
		 }
		 System.out.println();
	 }
}
}
