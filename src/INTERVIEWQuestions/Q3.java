package INTERVIEWQuestions;

public class Q3 {
	  public static void main(String[] args) {
		
  // Find out how many alpha characters present in a string?
		  
	String str= "hdg45**ghee7#";
	
	String replace=str.replaceAll("[^a-zA-Z]", "");
	System.out.println("Number of alpha characters is "+replace.length());	  
		  
		  
		  
		  
}
}