package com.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Program9 {
	
	public static void main(String[] args) {
		
		//creating a map and putting objs
		Map<Integer,String> map = new HashMap();
		map.put(101,"tvs");
		map.put(102,"honda");
		map.put(105, "sizuki");
		map.put(103, "hero");
		map.put(107,"ktm");
		map.put(106, "bmw");
		map.put(104,"kawasaki");
		
		System.out.println(map);
		System.out.println(map.containsKey(103));
		System.out.println(map.containsValue("tvs"));
		System.out.println(map.remove(103));//to delete
		System.out.println(map.hashCode());
		System.out.println(map.replace(102,"activa"));
		System.out.println(map.entrySet());//gives the op in set
		map.entrySet().forEach(System.out::println);//iterating over map
		map.keySet().forEach(System.out::println);//iterating only keys
		System.out.println(map.values());
		
		
		
		
	}

}
