package ReplTask;

public class Task78 {

   /* Create a Class main that should be a template for the DogClass. 
      In this class you should specify the following attributes: breed, name, color and following behaviors: bark(), run(), play().
      Create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
      
      Husky can bark           Bulldog can bark    Labrador can bark
      Husky can run            Bulldog can run     Labrador can run
      Husky can play           Bulldog can play    Labrador can play   
   */
	
	String breed, name, color;
	
	public static void main(String[] args) {
		
	Task78 dog=new Task78();
	
	dog.breed="Husky";
	dog.name="Ricky";
	dog.color="White";
	
	dog.bark();
	dog.run();
	dog.play();
	
	Task78 dog1=new Task78();
	
	dog1.breed="Buldog";
	dog1.name="Aure";
	dog1.color="Braon";

	dog1.bark();
	dog1.run();
	dog1.play();
	
    Task78 dog2=new Task78();
	
	dog2.breed="Labrador";
	dog2.name="Jacky";
	dog2.color="Yellow";
	
	dog2.bark();
	dog2.run();
	dog2.play();
	
}
	void bark() {
		System.out.println( breed+" can bark");
	}
	void run() {
		System.out.println(breed+" can run");
	}
	void play() {
		System.out.println(breed+" can play");
	}
}