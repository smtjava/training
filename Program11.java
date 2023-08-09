package com.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map= new TreeMap();
		
		map.put(22, 'a');
		map.put(101, "ap");
		map.put(33,'d');
		map.put(9,"java");
		map.put(14,1000);
		
		map.entrySet().forEach(System.out::println);//op is sorted
		map.remove(9);
		map.replace(22, "replaced");
		System.out.println(map.entrySet());
		
	}

}
