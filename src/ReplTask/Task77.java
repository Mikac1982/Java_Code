package ReplTask;

public class Task77 {

	/*Create a class named 'Main' with specific attributes.
      For you to do

     Create two object in which you will be assigning the following values.
     carColor="Black"
     carModelYear=2019
     carName='BMW'

     carColor='White'
     carModelYear=2018
     carName='Toyota'

    Car color is Black and car model year is 2019 and car name is BMW
    Car color is White and car model year is 2018 and car name is Toyota
	 */
	
	String carColor, carName;
	int  carModelYear;
	
	public static void main(String[] args) {
			
		Task77 car=new Task77();
		car.carColor="Black";
		car.carModelYear=2019;
		car.carName="BMW";
		
		System.out.println("Car color is "+car.carColor+" and car model is year "+car.carModelYear+" and car name is "+car.carName);
		
		Task77 car1=new Task77();
		car1.carColor="White";
		car1.carModelYear=2018;
		car1.carName="Toyota";
		//car1.print();
		System.out.println("Car color is "+car1.carColor+" and car model is year "+car1.carModelYear+" and car name is "+car1.carName);
	}
	void print() {
		
	}
}
