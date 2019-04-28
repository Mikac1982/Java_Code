package com.class29Again;
/*We have to calculate the percentage of marks obtained 
  in three subjects (each out of 100) by student A 
  and in four subjects (each out of 100) by student B. 
  Create class ‘Marks’ with an abstract method ‘getPercentage’. 
  It is inherited by classes ‘A’ and ‘B’ each having a method with the same name 
  which returns the percentage of the students. 
  The constructor of student A takes the marks in three subjects as its parameters 
  and the marks in four subjects as its parameters for student B. Test your code
*/
public abstract class Marks {

	double mathMark, englishMark, scienceMark;
	public abstract void getPercentage();
	
	double sum;
	double percentage;
}
class A extends Marks{
	
	A(double mathMark, double englishMark, double scienceMark){
		super.mathMark=mathMark;
		super.englishMark=englishMark;
		super.scienceMark=scienceMark;
	}
	
	public void getPercentage() {
		sum=mathMark+englishMark+scienceMark;
		percentage=(sum*100)/(3*100);
		System.out.println("The percantage of marks in 3 subjects obtained by student A is: "+percentage);
	}
}
class B extends Marks{
	double historyMark;
	
	B(double mathMark, double englishMark, double scienceMark, double historyMark){
		super.mathMark=mathMark;
		super.englishMark=englishMark;
		super.scienceMark=scienceMark;
		this.historyMark=historyMark;
	}
	
	public void getPercentage() {
		sum=mathMark+englishMark+scienceMark+historyMark;
		percentage=(sum*100)/(4*100);
		System.out.println("The percantage of marks in 4 subjects obtained by student B is: "+percentage);
	}
}
