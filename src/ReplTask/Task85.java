package ReplTask;

public class Task85 {

	//Multiple Parameters for method
	//create method with Multiple Parameters as int 
	//and write the logic in that method in println statement to print hours : with minutes 
	//and call the method in main method with values 
    //Output: MUST BE!!!  11:30
	

  public static void main(String[] args) {
	
	  Task85 obj=new Task85();
	  obj.printTime(11, 30);
	    
  }
	void printTime(int h, int m) {	
	 	System.out.println( h+":"+ m);	
		
	}
	
}
