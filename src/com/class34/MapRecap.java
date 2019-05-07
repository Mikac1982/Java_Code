package com.class34;
import java.util.*; 
public class MapRecap {

	public static void main(String[] args) {
		
	Map<Integer, String> map=new HashMap<>();
	map.put(1, "A");
	map.put(2, "B");
	map.put(3, "C");
	map.put(4, "D");
	map.put(null, "E");
	map.put(5, null);	
	map.put(4, "E");	
	System.out.println(map); //{null=E, 1=A, 2=B, 3=C, 4=E, 5=null}
		
	Map<Integer, String> lmap=new LinkedHashMap<>();
	lmap.put(1, "A");
	lmap.put(2, "B");
	lmap.put(3, "C");
	lmap.put(4, "D");
	lmap.put(null, "E");
	lmap.put(5, null);	
	lmap.put(4, "E");	
	System.out.println(lmap); //{1=A, 2=B, 3=C, 4=E, null=E, 5=null}
	
	//sort keys based on values
	Map<Integer, String> tmap=new TreeMap<>(); 
	tmap.put(1, "A");
	tmap.put(2, "B");
	tmap.put(3, "C");
	tmap.put(4, "D");
//	tmap.put(null, "E"); // can NOT have null keys
	tmap.put(5, null);	 // can have null values
	tmap.put(4, "E");		
	System.out.println(tmap);	//{1=A, 2=B, 3=C, 4=E, 5=null}
		
	Map<Integer, String> map1=new Hashtable<>(); 
	map1.put(1, "A");
	map1.put(2, "B");
	map1.put(3, "C");
	map1.put(4, "D");
//	map1.put(null, "E");
//	map1.put(5, null);
	System.out.println(map1); //{4=D, 3=C, 2=B, 1=A}
	
	
	
	
	
	
		
	}
}
