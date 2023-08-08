package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//creating a list and adding Employee class obj
		List<Employee> al= new ArrayList<>();
		al.add(new Employee("Santa","85728111",108));
		al.add(new Employee("Banta","628622811",102));
		al.add(new Employee("Panta","086528111",107));
		al.add(new Employee("Kanta","5678111",105));
		al.add(new Employee("Hanta","715928111",110));
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
		 
		

	}

}
