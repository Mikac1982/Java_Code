package ReplTask;

import java.util.HashSet;
import java.util.Set;

public class Task157 {

	public static void main(String[] args) {
		
	Set<String> hset=new HashSet<>();
	  hset.add("first");
	  hset.add("second");
	  hset.add("third");
	  hset.add("fourth");
	  hset.add("fifth");	
	  System.out.println(hset);
		
	  hset.remove("second");
	  System.out.println(hset);	
		
	  hset.removeAll(hset);
	  System.out.println(hset);
		
		
		
		
		
		
		
	}
}
