package ReplTask;

import java.util.ArrayList;

public class Task152 {
 /* Create a ArrayList with boolean inputs  true,false,false
    add your boolean values
    (true, false, false)
    The modified ArrayList should be
    true ,false ,false ,true ,false ,false , 
 */
	public static void main(String[] args) {
		
		ArrayList<Boolean> list=new ArrayList<Boolean>();
		list.add(true);
		list.add(false);
		list.add(false);
		
		for (int i=0; i<=1; i++) {
		   for (int j=0; j<=list.size()-1; j++) {
			   System.out.print(list.get(j)+", ");
		   }
	
		
	}
  }
}
