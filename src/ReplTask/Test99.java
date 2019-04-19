package ReplTask;

public class Test99 {

	public static void main(String[] args) {
		
		Task99 sp1=new Task99("Eggs",3,"Produce",true,10);
		Task99 sp2=new Task99("Paper Towels",2,24);
		Task99 sp3=new Task99("Paper Towels",2);

	System.out.println(sp1.label+" "+sp1.price+" "+sp1.category+" "+sp1.hasExpiration+" "+sp1.stock);	
	System.out.println(sp2.label+" "+sp2.price+" "+sp2.category+" "+sp2.hasExpiration+" "+sp2.stock);	
	System.out.println(sp3.label+" "+sp3.price+" "+sp3.category+" "+sp3.hasExpiration+" "+sp3.stock);	
	
	
	}
	
	
	
	
}
