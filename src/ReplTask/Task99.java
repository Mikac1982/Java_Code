package ReplTask;

public class Task99 {

	  String label;
	  int price;
	  String category;
	  boolean hasExpiration;
	  int stock;
	  
   Task99(String s1, int a, String s2, boolean flag, int b){
		 label=s1;
		 price=a;
		 category=s2;
		 hasExpiration=flag;
		 stock=b;
 //  System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
   }
   
	Task99(String s1, int a,int b){
		label=s1;
		price=a;
		stock=b;
		category="misc";
		hasExpiration=false;
//	System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);	
	}
	
	Task99(String s1, int a){
		label=s1;
		price=a;
//	System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	
	
	
}
