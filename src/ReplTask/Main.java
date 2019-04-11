package ReplTask;

public class Main {
   
		static String mixString(String s1, String s2)    {
		    
		    char str1=' ';
		    char str2=' ';
		    String mix= " ";
		    
		    for (int i=0; i<s1.length(); i++) {
		        
		        str1=s1.charAt(i);
		        str2=s2.charAt(i);
		        
		        mix= mix+str1+str2;
		        // System.out.print(mix);
		        
		    }
		    
		    return mix;
		}
		        
		    //test case below (dont change):
		    public static void main(String[] args){
		      
		     System.out.println ( mixString("12345","abcde")); //should be 1a2b3c4d5e
		        System.out.println (mixString("howdy","hello")); //should be hhoewldlyo
		        
		    }
		
	
}
