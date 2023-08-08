package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.comparable.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//creating a list and adding Employee class obj
			List<Employee> al= new ArrayList<>();
			al.add(new Employee("Smith","85728111",2208));
			al.add(new Employee("Jhon","628622811",2102));
			al.add(new Employee("Blake","086528111",2207));
			al.add(new Employee("King","5678111",2105));
			al.add(new Employee("Andy","715928111",2210));
			Collections.sort(al);
			System.out.println(al);
			
			
			

	}

}
