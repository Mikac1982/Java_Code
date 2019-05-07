package ReplTask;
import java.util.*;

public class Task162 {
   /*Create HashMap with String and Integer.
     Print only the key values by using the Enhanced for loop 
     add values like ("ONE",1);
     Output  
     FIVE
     ONE
     FOUR
     TWO
     THREE 
   */
	public static void main(String[] args) {
		
	Map<String,Integer>map=new HashMap<>();	
	map.put("ONE", 1);
	map.put("TWO", 2);
	map.put("THREE", 3);
	map.put("FOUR", 4);
	map.put("FIVE", 5);
	
	Set<String> keyValue=map.keySet();
	for(String key:keyValue) {
		System.out.println(key);
	}
		
		
		
		
		
		
	}
}
