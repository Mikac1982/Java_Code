package Encapsulation;

public class Student {
    
	//private variable
	private String name;
	
	//GETTER method for name
	public String getName() {
		return name;
	}
	//SETTER method for name
	public void setName(String name) {
		this.name=name;
	}
	
	//READ-ONLY ==getter
	private String college="AKG";
	//getter method
	public String getCollege() {
		return college;
	}
	
	//WRITE-ONLY == setter
	private String school;
	
	//setter method
	public void setSchool(String school) {
		this.school=school;
	}
	
	
	
}
