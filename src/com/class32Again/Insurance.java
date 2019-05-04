package com.class32Again;
/* Create a class Insurance that will have an attribute as insuranceName 
 * and unimplemented behaviour as getQuote and cancelInsurance. 
 * Create 3 subclasses Car, Pet, Health. 
 * Car class has it’s own attribute as carModel and Class Pet has petType attribute.
   Create 3 objects of the sub classes and store them in ArrayList. 
   Using 1 reference variable access methods from different classes.
 */
public abstract class Insurance {
    String insuranceName;
	
    public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	public abstract void getQuoate();
	public abstract void cancelInsurance();
	
}
class CarInsurance extends Insurance{
    String carModel;
    
	public CarInsurance(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
	}

	@Override
	public void getQuoate() {
		System.out.println("This is "+insuranceName+" insurance for "+carModel);	
	}
	@Override
	public void cancelInsurance() {
		System.out.println("We can cancel "+insuranceName+" insurance for "+carModel);
	}
}
class PetInsurance extends Insurance{
    String petType;
    
	public PetInsurance(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
	}

	@Override
	public void getQuoate() {
		System.out.println("This is "+insuranceName+" insurance for "+petType);	
	}
	@Override
	public void cancelInsurance() {
		System.out.println("We can cancel "+insuranceName+" insurance for "+petType);
	}
}
class HealthInsurance extends Insurance{
    
	public HealthInsurance(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuoate() {
		System.out.println("This is our "+insuranceName+" insurance");	
	}
	@Override
	public void cancelInsurance() {
		System.out.println("We can cancel "+insuranceName+" insurance");
	}
}
