package com.class32;
/*Create a class Insurance that will have an attribute as insuranceName 
 * and unimplemented behaviour as getQuote and cancelInsurance. 
 * Create 3 subclasses Car, Pet, Health. 
 * Car class has it’s own attribute as carModel and Class Pet has petType attribute.
   Create 3 objects of the sub classes and store them in ArrayList. 
   Using 1 reference variable access methods from different classes.
 */
public abstract class Insurance {
 
	String insuranceName;
	
	public Insurance(String insuranceName){
		this.insuranceName=insuranceName;
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();	
}
class Car extends Insurance{

	String carModel;

	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
	}
	public void getQuote() {
		System.out.println("This is quote for " + insuranceName + " and " + carModel);
		
	}
	@Override
	public void cancelInsurance() {
		System.out.println("We canceled "+ insuranceName + " and " + carModel);
		
	}
}
class Pet extends Insurance{
	String petType;
	
	public Pet(String insuranceName,String petType ) {
		super(insuranceName);
		this.petType=petType;
	}
	public void getQuote() {
		System.out.println("This is quote for " + insuranceName + " and " + petType);
		
	}
	@Override
	public void cancelInsurance() {
		System.out.println("We canceled "+ insuranceName + " and " + petType);
		
	}
}
class Health extends Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
	}
    @Override
	public void getQuote() {
    	System.out.println("This is quote for " + insuranceName);
    }
	@Override
	public void cancelInsurance() {
		System.out.println("We canceled "+ insuranceName );
		
	}
	
	
	
}




