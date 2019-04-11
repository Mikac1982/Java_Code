package ReplTask;

public class Task63 {
   public static void main(String[] args) {
	
  // Write a program that checks if a 2-D integer array is a square array, meaning, if its rows and columns are equal.
   
	int[][] a= {
			{1,1,1},
			{1,1,1},
			{1,1,1}
	};
	
	int rows=a.length;
	int col=a[0].length;
	int col1=a[1].length;
	int col2=a[2].length;
	
	if (rows==col && col==col1 && col1==col2) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	//second way
	   
	for (int i=0; i<a.length; i++)  {
		
		for (int y=0; y<a[i].length; y++) {
			
			if (a[i]==a[y]) {
				
			} else {
				
			}
		}
	} 
	 System.out.println("true");  
}
}
