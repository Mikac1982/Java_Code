package ReplTask;

public class Task95 {

    /*Write a method that: Returns: a String
     Method Name: makeThreeSubstr
     Parameters:
     a String called "word"
     an integer called "startIndex"
     an integer called "endIndex"
     Then, starting on line 4, write code that will return 3x the substring (no spaces) from "startIndex" to "endIndex"
	 */
	
	static String makeThreeSubstr(String word,int startIndex,int endIndex) {
		
		for (int i=0; i<=word.length(); i++) {
		}
		String sub3=(word.substring(startIndex, endIndex))+(word.substring(startIndex, endIndex))+(word.substring(startIndex, endIndex));
			
		return sub3;
	}
	
	public static void main(String[] args) {
		
		System.out.println(makeThreeSubstr("hello",0,2));       //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
		
	}
	
	
	
	
	
	
	
	
	
}
