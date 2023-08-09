package com.LinkedHashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map= new LinkedHashMap();
		map.put(01,"blue");
		map.put(02, "green");
		map.put(07, "red");
		map.put(106,"whote");
		map.put(104,"black");
		
		map.remove(106);
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + val);
			
		}
		

	}

}
