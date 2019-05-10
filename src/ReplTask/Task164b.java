package ReplTask;
import java.util.*;
public class Task164b {

	public static void main(String[] args) {
		
	Map<String, String> map=new HashMap<>();	
	map.put("ONE","AAA");
	map.put("TWO","BBB");
	map.put("THREE","CCC");
	map.put("FOUR","DDD");
	map.put("FIVE","EEE");	
	
	System.out.println("HashMap Before Remove :");
	Set<String> keyVal=map.keySet();	
	for(String key:keyVal) {
		System.out.println(key+" : "+map.get(key));
	}
		
	map.remove("ONE","AAA");	
	map.remove("FOUR","DDD");
	
	System.out.println("--------------------");
	System.out.println("HashMap After Remove :");
	
	Iterator<String> it=map.keySet().iterator();
	while(it.hasNext()) {
		String key=it.next();
		System.out.println(key+" : "+map.get(key));
	}
	
	
	}
}
