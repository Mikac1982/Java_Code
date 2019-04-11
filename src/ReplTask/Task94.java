package ReplTask;

public class Task94 {

  /*Write a method that: 
    Returns: a boolean
    Method Name: bothEven
    Parameters:
    an integer called "num1"
    an integer called "num2"
    Then, starting on line 4, write code that will return true if both num1 and num2 are even.  Return false otherwise.
	 
	 */
	public static void main(String[] args){
		System.out.println(bothEven(8,6)); //should be true
		System.out.println(bothEven(5,6)); //should be false
	}
	
	static boolean bothEven(int num1, int num2) {
		boolean even=true;
		if (num1%2==0 && num2%2==0) {
			 even=true;
		}else {
			 even=false;
		}
		
		return even;
		
	}
	
	
	
	
	
}
