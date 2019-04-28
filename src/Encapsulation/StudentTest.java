package Encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		
		Student obj=new Student();
		
		//setting value in the name variable
		obj.setName("Milena");
		//getting value of the name variable
		System.out.println("My name is "+obj.getName() );
		
	//	obj.setCollege(); //method is undefined for setCollege --> can't change the value AKG
		System.out.println(obj.getCollege());
		
	//	System.out.println(obj.school); variable school is not visible 
	//	System.out.println(obj.getSchool()); //there is no such a method
	}
	
	
	
	
	
}
