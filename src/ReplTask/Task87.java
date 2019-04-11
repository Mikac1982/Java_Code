package ReplTask;

public class Task87 {

 /*Create multiple methods with same name but should different in the type of argument
   method1 with int type parameter
   method1 with String type parameter
   method1 with double type parameter
   method1 with float type parameter
   and write the logic in that method to print respective value based on the parameter value 
   you passed in the method type 
   and call the method in main method with values 
   Output should be:
   100
   SyntaxSolutions
   100.09
   200.0998
 */
    public static void main(String[] args) {
	Task87 obj=new Task87();
	obj.method1(100);	 
	obj.method1("SyntaxSolutions");
	obj.method1(100.09);
	obj.method1(200.0998);
	
   }	
   void method1(int a) {
	   System.out.println(a);
   }	 
   void method1(String str) {
	  System.out.println(str);
   }
   void method1(double d) {
	  System.out.println(d);
   }	
   void method1(float f) {
	  System.out.println(f);
   }	
  
	
	
	
}
