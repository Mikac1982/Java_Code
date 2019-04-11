package ReplTask;

public class Task92 {

  /*Returns: a double
    Name: negate
    Parameters: a double called "num"
    Then, starting on line 4, write the code that will return the opposite value of num 
    (if it's positive, make it negative, otherwise make it positive)
 */
	
	public static void main(String[] args) {
		
		System.out.println(negate(77));
		System.out.println(negate(-36));
	}
	 static double negate(double num) {
	//	double oposite ;
	//   oposite=num-num-num;
			
		return num*(-1);
	}
	
	
	
}
