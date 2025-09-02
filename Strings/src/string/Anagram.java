package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String s1 = sc.next();
		String s2=sc.next();
		
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
//		Arrays.equals(ch1, ch2) ? System.out.println("Anagram"); : System.out.println("Not");
		
		System.out.println(Arrays.equals(ch1, ch2)? "Anagram":"Not");

	
	}

}
