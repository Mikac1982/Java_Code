package JavaInterviewQuestions;

public class IQ3 {
	// Find out how many alpha characters present in a string?
	
	public static void main(String[] args) {
		
		
	String str="hfgsgu3537h--sgef8390d-ehey";
	System.out.println(str.length());  //27
	
	String replaced=str.replaceAll("[^a-zA-Z]", "");	
	System.out.println("Number of alpha characters is: "+replaced.length());	
		
	String replaced2=str.replaceAll("[^0-9]", "");
	System.out.println("Number of numeric characters is: "+replaced2.length());
		
	String replaced3=str.replaceAll("[a-zA-Z]", "")	;
	System.out.println("Number of non-alpha characters is: "+replaced3.length());
		
	}
}
