package ReplTask;

import java.util.HashSet;

public class Task158 {
 //Converting a HashSet to an Array
	
	public static void main(String[] args) {
		
		  HashSet<String> hset=new HashSet<>();
		  hset.add("first");
		  hset.add("second");
		  hset.add("third");
		  hset.add("fourth");
		  hset.add("fifth");	
		  System.out.println("HashSet contains: "+hset);
		
		System.out.println("Array elements:");
		String[] array=new String[hset.size()];
		hset.toArray(array);
		for (String s:array) {
			System.out.println(s);
		}
		
	}
}
