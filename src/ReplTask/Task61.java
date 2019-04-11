package ReplTask;

public class Task61 {
   public static void main(String[] args) {
	
   // Write a program to sum the elements in the third row.   
	   
	   int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}   //10
			};   
	
	int sum=0;
	
	for (int i=0; i<a[2].length; i++)  {
		
		sum+=a[2][i];
	}
	System.out.println(sum);
	   
	   
	   
   }
	  
}
