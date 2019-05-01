package ReplTask;

import java.util.ArrayList;

public class Task153 {
 /* We will be manipulating elements of an ArrayList by using List methods.
    Create a method in which you will be storing names into ArrayList and your method should return that arrayList object.
    Please add the three names like Shiva,Sandish,Asel
       Output would be:
      [Shiva, Sandish, Asel] 
  */
	public static ArrayList<String> method() {
		
	ArrayList<String> names=new ArrayList<String>();
	names.add("Shiva");
	names.add("Sandish");
	names.add("Asel");
	
	return names;
	}	
	
	public static void main(String[] args) {
		
		ArrayList<String> elements=method();
		System.out.println(elements);	
	}
	
}
