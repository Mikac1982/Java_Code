package com.class32Again;

import java.util.ArrayList;
import java.util.Iterator;

public class IncuranceTest {

	public static void main(String[] args) {
		
		Insurance car=new CarInsurance("Geico", "BMW");
		Insurance pet=new PetInsurance("Progresive", "cat");
		Insurance health=new HealthInsurance("Kaiser");
		
		ArrayList<Insurance> alist=new ArrayList<>();
		alist.add(car);
		alist.add(pet);
		alist.add(health);
		
		//advanced for loop
		for (Insurance ins:alist) {
			System.out.println(ins.insuranceName);
			//ins.getQuoate();
			//ins.cancelInsurance();	
		}
		//iterator
		Iterator<Insurance> it=alist.iterator();
		while(it.hasNext()) {
			Insurance obj=it.next();
			obj.getQuoate();
		}
		//for loop
		for (int i=0; i<alist.size(); i++) {
			alist.get(i).cancelInsurance();;
			
		}
	}
}
