package ReplTask;

public class Task82 {
  //Create two method without any parameters  after main method create one method
	//method name as syntaxSolutions
	//and write the logic for that method in println statement as "Welcome to syntax solutions"
	//In class create one method 
	//method name as thirdBatch
	//and write the logic for that method in println statement as "Welcome to thirdBatch"
	//in main method try to call the two methods
	
	public static void main(String[] args) {
		
		Task82 obj=new Task82();
		obj.syntaxSolutions();
		obj.thirdBatch();
	}
	void syntaxSolutions() {
		System.out.println("Welcome to syntax solutions");
	}
	
	void thirdBatch() {
		System.out.println("Welcome to thirdBatch");
	}
	
}
