package ReplTask;

public class Test98 {

	public static void main(String[] args) {
		
		
		Task98 car1=new Task98("Toyota","Prius",4,120,30000.0);
		Task98 car2=new Task98("Toyota","Prius",120,30000);
		Task98 car3=new Task98(4,120,30000);
		Task98 car4=new Task98("Toyota","Prius",4);
		
		System.out.println(car1.make+" "+car1.model+" "+Task98.numOfDoors+" "+car1.topSpeed+" "+car1.price);
		System.out.println(car2.make+" "+car2.model+" "+Task98.numOfDoors+" "+car2.topSpeed+" "+car2.price);
		System.out.println(car3.make+" "+car3.model+" "+Task98.numOfDoors+" "+car3.topSpeed+" "+car3.price);
		System.out.println(car4.make+" "+car4.model+" "+Task98.numOfDoors+" "+car4.topSpeed+" "+car4.price);
	}
	

}
