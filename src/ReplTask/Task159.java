package ReplTask;
import java.util.*;
public class Task159 {

	public static void main(String[] args) {
		//Create set of string values 
		//Please add the below values and see the result 

	Set<String> set=new TreeSet<>(); 	
	set.add("India"); 
	set.add("Australia"); 
	set.add("South Africa"); 
	set.add("India");
	set.add("America");
	set.add("America");	
	
	System.out.println(set);
	
	set.clear();
	System.out.println(set);
	}
}
