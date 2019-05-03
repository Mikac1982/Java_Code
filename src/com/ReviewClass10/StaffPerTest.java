package com.ReviewClass10;

public class StaffPerTest {
	
  public static void main(String[] args) {
	
	  Profesors p1=new Profesors("John Snow", "123 abc st",70000, "BMW", "18/10/2010", 566662);
	  Profesors p2=new Profesors("Arias Star", "3 abc st",79000, "BMW", "12/10/2010", 25555362);
	  Profesors p3=new Profesors("Tom Snow", "23 abc st",70600, "BMW", "16/10/2010", 8838262);
	  
	  Secretary s1=new Secretary("John Snow", "123 abc st",70000, "BMW", "18/10/2010", 566662);
	  Secretary s2=new Secretary("Tom Snow", "23 abc st",70600, "BMW", "16/10/2010", 8838262);
	  
	  System.out.println("Department salary total = "+(p1.getSalary()+p2.getSalary()+p3.getSalary()+s1.getSalary()+s2.getSalary()));
	  
	  
}
}
