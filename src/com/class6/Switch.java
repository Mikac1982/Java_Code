package com.class6;

public class Switch {
	public static void main(String[] args) {
		
//		int day=4;
//		String dayName;
		
//		if (day==1) {              // always checking a BOOLEAN
//			dayName="Monday";
//		}else if (day==2) {
//			dayName="Tuesday";
//		}else if (day==3) {
//			dayName="Wednsday";
//		}else if (day==4) {
//			dayName="Thursday";
//		}else if (day==5) {
//			dayName="Friday";
//		}else if (day==6) {
//			dayName="Saturday";
//		}else if (day==7) {
//			dayName="Sunday";
//		}else {
//		    dayName="Invalid";
//	}
//  System.out.println("Today is "+dayName);
  
		
     int day=4;
     String dayName;
   
  switch (day) {           // just for one variable!
                           // switch will have own block of code
  case 1:
	  dayName="Monday";
	  break;              // tells you to stop, as soon as it find matching variable
  case 2:
	  dayName="Tuesday";  //if your day is equal to (==).. equality!
	  break;
  case 3:
	  dayName="Wednesday";    // always checking a VALUE for one variable!
	  break;
  case 4:
	  dayName="Thursday";
	  break;
  case 5:
	  dayName="Friday";
	  break;
  case 6:
	  dayName="Saturday";
	  break;
  case 7:
	  dayName="Sunday";
	  break;
  default:
	  dayName="Invalid";
  }
  System.out.println("Today is "+dayName);
	}
}
