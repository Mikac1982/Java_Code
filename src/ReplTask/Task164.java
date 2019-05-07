package ReplTask;
import java.util.*;
public class Task164 {
 
   public static void main(String[] args) {
   /*How do you check whether a particular key/value exist in a HashMap
     Add the below values
     1  1.1
     2  2.2
     3  3.3
     4  4.4
     5  5.5
     Check weather  key 3 is there? Values 4.4? And key 6
     */	
		
	Map<Integer,Double>	map=new HashMap<>();
	map.put(1, 1.1);
	map.put(2, 2.2);
	map.put(3, 3.3);
	map.put(4, 4.4);
	map.put(5, 5.5);
		
	System.out.println(map.containsKey(3));	
	System.out.println(map.containsValue(4.4));	
	System.out.println(map.containsKey(6));	
		
		
		
		
		
		
	}
}
