package com.class32Again;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Sasha {

	public static void main(String[] args) {
        HashSet<String> hset=new HashSet<String>();
        hset.add("Leningrad");
        hset.add("DC");
        hset.add("London");
        hset.add("Toronto");
        
        System.out.println("Print cities without order "+hset);
        hset.add("DC");
        hset.add("London");
        
        List<String>tlist= new ArrayList<String>(hset);
        Collections.sort(tlist);
        System.out.println(tlist);
        
        for(String st:tlist) {
            System.out.println(st);
        }
}
}