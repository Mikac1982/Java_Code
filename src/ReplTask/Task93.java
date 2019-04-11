package ReplTask;

public class Task93 {

	/*Returns: a char
     Method Name: getChar
     Parameters:
     a String called "word"
     an integer called "index
     Then, starting on line 4, write code that will return the character in "word" at the index "index"
     Examples:
     getChar("hello",1) ==> 'e'
	 */
	
    public static void main(String[] args) {
		System.out.println(getChar("hello",1));//should be e
	}
	
	 static char getChar(String word, int index){
	   
	   char ch=word.charAt(index);
		return ch ;
	}
	
	
	
	
}
