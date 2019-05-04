package INTERVIEWQuestions;

public class Q3 {
	  public static void main(String[] args) {
		
  // Find out how many alpha characters present in a string?
		  
	String str= "hdg45**ghee7#";
	
	String replace=str.replaceAll("[^a-zA-Z]", "");
	System.out.println("Number of alpha characters is "+replace.length());  //7	  
		  
	
	String str2=str.replaceAll("[^0-9]", "");
	System.out.println("Number of numeric characters is "+str2.length());   //3
	
	
	String str3=str.replaceAll("[a-zA-Z]", "");	  
	System.out.println("Number of non alpha characters is "+str3.length()); //6	  
}
}