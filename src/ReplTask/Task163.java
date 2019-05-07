package ReplTask;
import java.util.*;

public class Task163 {
   /*Add the following values to the Map
      map.put("Shiva",222);
      map.put("Sandish",333);
      map.put("Asel",555);
      map.put("Sumair",666);
      Print all keys using iterator 
    */
	public static void main(String[] args) {
		
	Map<String,Integer>	map=new LinkedHashMap<>();
	map.put("Shiva",222);
    map.put("Sandish",333);
    map.put("Asel",555);
    map.put("Sumair",666);	
	
    Set<String> key=map.keySet();
    
    Iterator<String> it=key.iterator();    
	while(it.hasNext()) {
		System.out.println(it.next());
	}	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
