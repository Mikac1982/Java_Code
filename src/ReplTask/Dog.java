package ReplTask;

public class Dog {

	String name;
	static String breed="Mutt";
	double weight;
	
	Dog(String str, String str2, double a){
		name=str;
		breed=str2;
		weight=a;
		System.out.println("The main constructor(with all parameters)="+name+" "+breed+" "+weight);
		
	}
	
	Dog(String str, double a){
		name=str;
		weight=a;
		System.out.println("secondary constructor that takes in only Name and Weight (Breed defaults to Mutt)="+name+" "+breed+" "+weight);
	}
	
		
		
	
		
	
}
