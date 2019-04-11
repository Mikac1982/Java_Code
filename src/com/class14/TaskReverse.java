package com.class14;

public class TaskReverse {
    public static void main(String[] args) {
	
    	// Zaki's way
    	String str = "Today is Java Class";
        String revers = "";
        
        for(int i = str.length()-1; i >= 0; i--) {
            
            revers += str.charAt(i);
            
        }
        System.out.print(revers+" ");	
    	
    	
    	
    	
    	
	}
}
