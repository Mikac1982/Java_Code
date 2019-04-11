package com.JavaReview7;

public class Task3 {

	/* create a method that shows you all the vowels in a string
    * output: should only show these characters a,e,i,o,u,A,E,I,O,U,
    * this method can have any string value you put in, but must return
    * all the vowels within the string
    * "hello world my name Is wEqas"
    */
	String str="hello world my name Is wEqas";
	
        public static void main(String[] args) {
        	
        Task3 c=new Task3();
        c.vowels();
    }
    void vowels() {
            System.out.println(str.replaceAll("[^a,e,i,o,u,A,E,I,O,U]",""));
        }

}