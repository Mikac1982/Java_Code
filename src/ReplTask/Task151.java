
package ReplTask;

import java.util.ArrayList;

public class Task151 {
/* Create a ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.
   you use an array list that has these values added
   (0,1,2,3,4,5)
   the array list  output will print
   0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5,  
 */
	
 public static void main(String[] args) {
		
	ArrayList<Integer> list=new ArrayList<Integer>();
		
	
	for (int i=0; i<=5; i++) {
		list.add(i);
		list.add(i);
    }
	
	for (Object num : list) {
		System.out.print(num+", ");
	}	
	
/*   ArrayList<Integer> list=new ArrayList<Integer>();
    	list.add(0);
    	list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(5);	
	
	  for (int i=0; i<list.size(); i++) {
	   	   System.out.print(i+" ,");
		     System.out.print(i+" ,");
	  }
	 }
 * 	
 */
	
  }
 
}
