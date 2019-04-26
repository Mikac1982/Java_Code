package com.javaReview9Again;

class ChildSuper extends MainSuper{
	

	String name="Jacky";
	int age=43;
	char grade='B';
	
	ChildSuper(int a){
		super(3);
		System.out.println("This is child with 1 parameter "+a);
	}
	ChildSuper(int a, int b){
	//	super(1,3);
		System.out.println("This is child with 2 parameters "+b);
	}
	public void getDetails() {
		System.out.println(super.name+" "+super.age+" "+super.grade);
		System.out.println(this.name+" "+this.age+" "+this.grade);
	}
	
    public static void main(String[] args) {
		ChildSuper obj1=new ChildSuper(3,19);
	  //ChildSuper obj2=new ChildSuper(4);
		obj1.getDetails();
	}

}
