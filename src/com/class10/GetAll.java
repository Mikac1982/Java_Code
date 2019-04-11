package com.class10;

public class GetAll {
   public static void main(String[] args) {
	
	String[] names = { "John", "Mike", "Jane", "Talgat", "Olga", "Mehmet","Siyar"};  
	 
	int a=3;
	System.out.println(names[a]); //name with a index 3 is Talgat
	
	a+=2;
	System.out.println(names[a]); //Mehmet
	
	a-=4;
	System.out.println(names[a]);  //Mike  ?????
	
	int size=names.length;
	System.out.println(size);  // 7
	
	System.out.println();
	
//	System.out.println(names[0]);
//	System.out.println(names[1]);
//	System.out.println(names[2]);
	
	for (int i=0; i<size; i++) {     //to print all the names!   //or i<=size-1;
		System.out.println(names[i]);  
		
	}
}
}
