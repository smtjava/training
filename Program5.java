package demo;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Text :");
		char[] str=sc.next().toLowerCase().toCharArray();
		//Logic
		int count=0;
		for(char ch: str) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ) {
				count++;
			}
		}
		System.out.println("Total number of vowels :"+count);
	}

}
