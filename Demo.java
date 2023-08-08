package com.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		//creating an collection & adding values
		
		List<Integer>al = new ArrayList<>();
		al =Arrays.asList(19,96,9,227,13,65,1,52);
		System.out.println(al);
		
		//sorting by sort method
		Collections.sort(al);
		System.out.println(al);
		

	}

}
