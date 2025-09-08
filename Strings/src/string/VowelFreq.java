package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VowelFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> vowels=Arrays.asList('A','E','I','O','U','a','e','i','o','u');
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		
		Map<Character,Integer> mapp= new HashMap<>();
		
		char[] charArray = str.toCharArray();
		for(char ch: charArray) {
			if(vowels.contains(ch)) {
				mapp.put(ch, mapp.getOrDefault(ch,0)+1);
				
			}
		}
		
		System.out.println(mapp);

	}

}
