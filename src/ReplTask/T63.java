package ReplTask;

public class T63 {
   public static void main(String[] args) {

  // Write a program that prints the highest value in the array.  
	   
	  int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
	   };  
	
   
   int max=0;
   
   for (int i=0; i<a.length; i++)  {
	   for (int y=0; y<a[i].length; y++)  {
		   
		   if (a[i][y]>max)  {
			   max=a[i][y];
		   }
			   
	   }
   }
   System.out.println(max);
   
   
}
}
