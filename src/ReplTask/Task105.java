package ReplTask;

public class Task105 {

	//Create method and create the logic to increment the count value as count++
	//and in main method create the three objects and call the method
	//with three different object you created and print count value.
	//Output:
	//3
	//3
	//3
	
	static int count=0;
	
	public static void main(String[] args) {
		
		Task105 o1=new Task105();
		Task105 o2=new Task105();
		Task105 o3=new Task105();
		
	 o1.increment();
	 o2.increment();
	 o3.increment();
		
	 System.out.println(count);
     System.out.println(count);
     System.out.println(count);
     
    }
	
	public void increment() {
		count++;
			
	}
}
