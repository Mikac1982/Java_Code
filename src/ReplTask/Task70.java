package ReplTask;

public class Task70 {
    public static void main(String[] args) {
		
  //  	Print out the position of the first occurrence of "c"
  //  	Print out the position of the first occurrence of " "
  //  	Print out the position of the first occurrence of the variable target1
  //  	Print out the position of the first occurrence of the variable target2 	
    
     String str = "abracadabra alakazam";
     String target1 = "dab";
     String target2 = "ABRA";  	
    	
     int indexOf =str.indexOf("c");
     System.out.println(indexOf);    // 4
    
     System.out.println(str.indexOf(" "));     // 11
     System.out.println(str.indexOf(target1)); // 6
     System.out.println(str.indexOf(target2)); // -1
     
     
	}
}
