package ReplTask;

public class Task98 {

	public String make;
	public String model;
	public static int numOfDoors=4;
	public int topSpeed;
	public double price;
	
	Task98 (String str1, String str2, int a, int b, double c){
		make=str1;
		model=str2;
		numOfDoors=a;
		topSpeed=b;
		price=c;
	
	}
	Task98 (String s1, String s2, int a, double b){
		make=s1;
		model=s2;
		topSpeed=a;
		price=b;
	
	}
	Task98(int a, int b, double c){
		numOfDoors=a;
		topSpeed=b;
		price=c;
		make="unknown";
		model="unknown";
	
		
	}
	Task98(String s1, String s2, int a){
		make=s1;
		model=s2;
		numOfDoors=a;
		topSpeed=90;
		price=0;
	
	}
	
	
	
}
