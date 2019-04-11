package INTERVIEWQuestions;

public class Swap {
  public static void main(String[] args) {
	
	// Write a program to swap 2 numbers without a temporary variable?
	// Swap 2 strings without a temporary variable?  
	  
	  String str1 = "Best";
      String str2 = "Group";

      System.out.println("After swap str1 is: " + str1.replace("Best", "Group"));
      System.out.println("After swap str2 is: " + str1.replace("Group", "Best"));  
	  System.out.println();
	  
      
      String a = "Saturday";
      String b= "Java";
      
      a = a + " " + b;  //Saturday Java
      
      String[] array = a.split(" ");
              b = array[0];
              a = array[1];       
      System.out.println("Value of string a= "+a);
	  System.out.println("value of string b= "+b);
}
}
