package string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
//		1st Approach........
//		s1 = s1.toLowerCase();
//		String s2="";
//		for(int i=0;i<s1.length();i++) {
//			char ch = s1.charAt(i);
//			s2=ch+s2;
//		}
//		if(s1.equals(s2))
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not");
		
//		2nd Approach.....
		
		String reversed= new StringBuilder(s1).reverse().toString();
		
		if(s1.equalsIgnoreCase(reversed))
			System.out.println("Palindrome");
		else
		System.out.println("Not");
		

		
	}
	

}
