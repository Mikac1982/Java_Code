package ReplTask;

import java.util.Scanner;

public class Task74 {
    public static void main(String[] args) {
		
  //  	If language is Java
  //  	It should print the 
  //  	Java is a programming language.
  //  	If language is C
  //  	It should print the 
  //  	C is a procedural programming language
  //  	If language is C++
  //  	It should print the 
  //  	C++ is a middle-level programming language
  //  	If any other should print 
  //  	Doesn't match any programming language
 	
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter any programming language");
    String language = sc.nextLine(); 	
    String print;
    
    	
    	if (language.equals("Java")) {
    		print="Java is a programming language.";
    	}
    	else if (language.equals("C")) {
    		print="C is a procedural programming language";
    	}
    	else if (language.equals("C+")) {
    		print="C+ is a middle-level programming language";
    	}else if (language.equals("C++")) {
    		print="C++ is a middle-level programming language";
    	}
     else {
    	 print="Doesn't match any programming language";
     }
    
    System.out.println(print);
    
  	
	}
}
