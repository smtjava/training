package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Text :");
		char[] str=sc.next().toCharArray();
		
		for(char ch: str) {
			if(!map.containsKey(ch))
			{
			map.put(ch, 1);
			}
			else {
				int value= map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
		

	}

}
