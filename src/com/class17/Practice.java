package com.class17;

public class Practice {
 
	//// Create a method to find out minimum,second minimum,maximum and second maximum number of an array. 	 

	public static void main(String[] args) {

		 int max=0;
	     int min=0;
	     int max2=0;
	     int min2=0;
	     
	 Practice num = new Practice();
     num.maxAndMin(max, max2, min, min2);
		}

		void maxAndMin(int max, int max2, int min, int min2) {
			
			int[] arr = { -170,155,-54,200,20,9,-5 };

			for (int a:arr) {

				if (a>max) {
					max2=max;
					max=a;	
				}else if (a<min) {
					min2=min;
					min=a;
				}else if (a>max2) {
					max2=a;
				}else if (a<min2) {
					min2=a;
				}	
				
			}
			System.out.println("Largest number of an array is " + max);
			System.out.println("Second largest number is " + max2);
			System.out.println("Minimum number is " + min);
			System.out.println("Second minimum number is " + min2);

		}

}
