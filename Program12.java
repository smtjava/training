package com.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer, String> map = new Hashtable();
		map.put(402,"demo1");
		map.put(109,"demo9");
		map.put(379,"demo2");
		map.put(100, "demo");
		
		map.replace(100, "OOOO");
		map.remove(100);
		map.entrySet().forEach(System.out::println);
		
		}

}
