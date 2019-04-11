package com.class10;

public class ArrayDemo {
    public static void main(String[] args) {
		
    	int[] numbers=new int[4];  // initializing an array, we specify the size 
    	
    //	numbers[3]=10;
    //	numbers[2]=5;
    	numbers[0]=1;
    	numbers[1]=15;           
    	                                 // DISADVANTAGE OF ARREY:
    	System.out.println(numbers[2]);  // 0 --> it's already reserved for 4 values, [4]
    	                                 // so now the rest of spots are empty and holds value 0! (prints 0  
                                         // for String it would print NULL!
    	
    numbers[0]=2;
    System.out.println(numbers[0]);
    	
    	
    	
 }
}