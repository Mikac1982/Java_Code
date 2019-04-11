package ReplTask;

public class Task84 {

	//create one method and  pass a String  as single parameter in method 
	//and write the logic for that method in println statement two print twice 
	//and call the method in main method pass the the String as 
	//"Don't make me say this twice!"
	
	public static void main(String[] args) {
		
		Task84 obj=new Task84();
		obj.printTwice("Don't make me say this twice");
	}
	void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}
	
	
	
}
