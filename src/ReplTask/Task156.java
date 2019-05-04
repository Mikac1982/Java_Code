package ReplTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Task156 {

 public static void main(String[] args) {
		    
	 HashSet<String> hset=new HashSet<>();
	
	  hset.add("first");
	  hset.add("second");
	  hset.add("third");
	  hset.add("fourth");
	  hset.add("fifth");	
	  
	Iterator<String> it=hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	System.out.println("Does HashSet contains first element? "+hset.contains("first"));	    
		    
		    
		    
		    
		    
  }
}
