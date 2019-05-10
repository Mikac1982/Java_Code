package ReplTask;
import java.util.*;

public class Task165 {
 //replace with below key THREE--> ASEL and key FIVE-->SUMAIR

	public static void main(String[] args) {
			
		Map<String, String> map=new HashMap<>();	
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");	
	
		System.out.println("HashMap Before Replace :");
		Iterator<Map.Entry<String, String>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry=it.next();
			String mapValues=entry.getKey()+" : "+entry.getValue();
			System.out.println(mapValues);
		}
			
	   map.replace("THREE", "ASEL");
	   map.replace("FIVE", "SUMAIR");
	   
	   System.out.println("--------------------");
	   System.out.println("HashMap After Replace :");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
		
	}
}
