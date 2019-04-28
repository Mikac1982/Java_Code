package com.GroupTasks;
/* We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
 * by student A and in four subjects (each out of 100) by student B. 
 * Create class ‘Marks’ with an abstract method ‘getPercentage’.
 * It is inherited by classes ‘A’ and ‘B’ each having a method with the same name
 * which returns the percentage of the students. 
 * The constructor of student A takes the marks in three subjects as its parameters 
 * and the marks in four subjects as its parameters for student B. Test your code 
 */

public abstract class Marks {
    
    abstract void getPercentage ();

}

class A extends Marks{
    double math, english, science;
    
    A(double math, double english, double science){
        this.math=math;
        this.english=english;
        this.science=science;
    }

    @Override
    void getPercentage() {
        // TODO Auto-generated method stub
        double mathpercantage=(math*100)/100;
        double englishpercantage=(english*100)/100;
        double sciencepercantage=(science*100)/100;
        System.out.println("The percantage of Math class is "+mathpercantage);
        System.out.println("The percantage of English class is "+englishpercantage);
        System.out.println("The percantage of Science class is "+sciencepercantage);
        
    }
    
}
class B extends Marks{
    double math, english, science, PE;
    
    B(double math, double english, double science, double PE){
        this.math=math;
        this.english=english;
        this.science=science;
        this.PE=PE;
    }

    @Override
    void getPercentage() {
        // TODO Auto-generated method stub
        double mathpercantage=(math*100)/100;
        double englishpercantage=(english*100)/100;
        double sciencepercantage=(science*100)/100;
        double PEpercantage=(PE*100)/100;
        System.out.println("The percantage of Math class is "+mathpercantage);
        System.out.println("The percantage of English class is "+englishpercantage);
        System.out.println("The percantage of Science class is "+sciencepercantage);
        System.out.println("The percantage of PE class is "+PEpercantage);
        
    }
    
}