package Encapsulation;

public class AccountTest {

	public static void main(String[] args) {
		
		Account a=new Account();
		
		a.setAccNum(123456789L);
		a.setName("Milena");
		a.setAmount(400000f);
		
		System.out.println("Account name is "+a.getAccNum()+" ,name is "+a.getName()+" and amount od money is "+a.getAmount());
		
		
	}
	
	
	
	
	
}
