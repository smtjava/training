package Demo;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The String To Check If It's Palendrome :");
		String str= sc.next().toLowerCase();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("Its A Palendrome !!");
		}
		else {
			System.out.println("Its Not Palendrome !!");

		}
		
		
	}

}
