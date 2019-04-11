package com.JavaReview7;

public class Task1 {

   /* Create a method that shows you all the vowals in a string
    * Output: should only show these characters a,e,i,o,u,A,E,I,O,U,
    * This method can have any string value you put in, but must return all the vowals within the string 
	*/
	
	//String str;
	
	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		obj.vowelCountWithReplaceAll();
		obj.vowelCountWithLoop();		
	}
	void vowelCountWithReplaceAll() {
		String str="hEllo world my name Is wEqas";
		String replace=str.replaceAll("[^aA,eE,iI,oO,uU]", "");
		System.out.println(replace);
	}
	void vowelCountWithLoop() {
		String weqas="hello world my name Is wEqas";
		
		char[] c=weqas.toCharArray();
		char empty;
		
		for (int i=0; i<=weqas.length()-1; i++) {
			
			if (c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A'|| c[i]=='E'|| c[i]=='I'|| c[i]=='O'|| c[i]=='U') {
				
				empty=c[i];
				System.out.print(empty+",");
			}
			
			
		}
			
		
			
	
		
	}
  
	
	
	
	
	
}
