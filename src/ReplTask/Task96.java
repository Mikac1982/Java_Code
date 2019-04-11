package ReplTask;

public class Task96 {

  /*Write a method that: Returns: a String
    Method Name: mixString
    Parameters:  a String called s1
                 a String called s2
    Then, write code that will return the strings combined,
    one letter at a time, starting with s1.  
    See example below for an example.  You can assume that s1 and s2 are equal lengths:
    s1 ==> "12345"
    s2 ==> "abcde"
    mixString(s1,s2) ==> "1a2b3c4d5e"
  */
	
	static String mixString(String s1, String s2) {
		
		 String comb= "";
		    
		 for (int i=0; i<s1.length(); i++) {
		        
		     comb= comb+s1.charAt(i)+s2.charAt(i);
		 }
	     return comb;
	}
	
	public static void main(String[] args){
		System.out.println(mixString("12345","abcde")); //should be 1a2b3c4d5e
		System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
	}
	
	
	
	
	
	
	
	
}
