package com.class19;

public class Application2 {

	public static void main(String[] args) {  //we are passing arrays of string

        Animal2 anim = new Animal2();   //local variable (inside the method)
        
        System.out.println("-------This is anim1---------");
        
        anim.name = "Joe";
        anim.age = 40;
        
        System.out.println(anim.age);
        System.out.println(anim.weight);
        System.out.println(anim.breed);
        System.out.println(anim.name);
        
        anim.canBark();
        
        System.out.println(Animal2.isWild());
        
      //  anim.name = "Joe";
      //  anim.age = 40;
      //  System.out.println(anim.name);
      //  System.out.println(anim.age);
        
        Animal2 anim2 = new Animal2();        

        System.out.println("------This is anim2--------");

        System.out.println(anim2.age);
        System.out.println(anim2.weight);
        System.out.println(anim2.breed);
        System.out.println(anim2.name);


        
        Animal2 anim3 = new Animal2();        

        System.out.println("---------This is anim3---------");
        
                System.out.println(anim3.age);
                System.out.println(anim3.weight);
                System.out.println(anim3.breed);
                System.out.println(anim3.name);

        // for Minimum class 
         int arr[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
         System.out.println("Printing the minimum value");
         System.out.println(Minimum.minOfValues(arr));
         
         int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
         
         // for class MinAndMax
         MinAndMax.minOfValues(array);
         System.out.println("Minimum value of an array is "+MinAndMax.minOfValues(array));
         MinAndMax.maxOfValues(array);
         System.out.println("Maximum value of an array is "+MinAndMax.maxOfValues(array));
         
         
    }
}
