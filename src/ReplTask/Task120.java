package ReplTask;

public class Task120 {

	/*Write program to overload static method
        Create the two static method with different parameters and try to call them in main method
        create one method without parameter
        create another method with int parameter
    */
	
	
	public static void main(String[] args) {
	//	Task120 obj=new Task120();
		display();
		display(10);
	}
	
	public static void display() {
		System.out.println("M1 method without parameter");
	}
	
	public static void display(int a) {
		System.out.println("M1 method with int parameter");
	}
	
}
