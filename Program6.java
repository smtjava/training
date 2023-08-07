package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list=new ArrayList<>();
		list.add(2);
		list.add(21);
		list.add(17);
		list.add(24);
		list.add(56);
		list.add(99);
		list.add(8);
		list.add(112);
		
		Iterator<Integer> iterator = list.iterator();
	    while(iterator.hasNext()) {
	    	int number=iterator.next();
	    	if(number%2==0) {
	    	System.out.println("Even numbers are: "+number);
	    	}
	    	
	    }
    	

		
		

	}

}
