package ReplTask;

public class Task131 {

	static int a=10;
	static int b=20;
}

class Babe extends Task131{
	
	static int a=30;
	static int b=40;
	
	public void add(int a, int b) {
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}
}