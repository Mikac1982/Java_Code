package ReplTask;

public class Task122 {

	//Create two private method with different parameters and try to call them in main method
	//create one method without parameter
	//create another method with int parameter
	
	private void m1() {
		System.out.println("private m1 method");
	}
	
	private void m1(int a) {
		System.out.println("private m1 method with int parameter");
	}
	
	public static void main(String[] args) {
		
		Task122 obj=new Task122();
		obj.m1();
		obj.m1(3);
		
	}
}
