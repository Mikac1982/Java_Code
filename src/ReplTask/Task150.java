package ReplTask;

import java.util.ArrayList;

public class Task150 {
	// Create an ArrayList and modify it by removing every other element in the list,
	// starting with removing the 0th element.
	// Add these values below to your arrayList
	// ("hi" "yo" "sup" "yolo" "boop")
	// use an advanced for loop to print the new values to the array list
	// yo yolo 
	
	public static void main(String[] args) {
		
	ArrayList<String> words=new ArrayList<String>();
	words.add("hi");
	words.add("yo");
	words.add("sup");
	words.add("yolo");
	words.add("boop");
	
	for (int i=0; i<words.size(); i++) {
		words.remove(i);
	}
	
//	words.remove(0);
//	words.remove(1);
//	words.remove(2);
//	System.out.println(words);
	
	for (String value : words) {
		System.out.print(value+" ");
	}
		
		
	}
}
