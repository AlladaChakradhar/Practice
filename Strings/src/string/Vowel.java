package string;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		int vcount = 0,ccount=0;
		
		
		List<Character> vowels=Arrays.asList('A','E','I','O','U','a','e','i','o','u');
		char[] charArray = str.toCharArray();
		for(char ch: charArray) {
			if(vowels.contains(ch)) vcount++;
			else ccount++;
			
		}
		System.out.println("Vowels count :" +vcount);
		System.out.println("Consonants count :"+ccount);
	}

}
