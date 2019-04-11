package ReplTask;

public class Task83 {
  
	//create one method without any parameters  
	//method name as forLoop as void 
	//and write the logic  in the method to print 1 to 10 numbers
	//call the method in the main method

	public static void main(String[] args) {
		
		Task83 obj=new Task83();
		obj.forLoop();
		
	}
	
	void forLoop() {
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	
	
	
	
}
