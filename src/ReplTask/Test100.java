package ReplTask;

public class Test100 {

	public static void main(String[] args) {
		
		Task100 e1=new Task100();
		Task100 e2=new Task100("Joe","Smith", 12345,"01/01/1970",35000);
		
		System.out.println(e1.name+" "+e1.lastName+" "+e1.employeeId+" "+e1.startDate+" "+e1.salary);
		System.out.println(e2.name+" "+e2.lastName+" "+e2.employeeId+" "+e2.startDate+" "+e2.salary);
		
		
	}
	
	
	
	
	
}
