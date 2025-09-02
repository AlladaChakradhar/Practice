package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
	
	
	public static void main(String[] args) {
		
		String s1="Chakradhar";
		char[] chars = s1.toCharArray();
//		char[] rep;		
//		Set<Character> charSet= new HashSet<>();
		List<Character> charSet= new ArrayList<>();
		List<Character> dupl= new ArrayList<>();
		
		for(char ch: chars) {
			if(!charSet.contains(ch)) {
				charSet.add(ch);	
			}else {
				dupl.add(ch);
			}
		}
		
		System.out.println("Duplicate Characters :" +dupl);
		
		System.out.println("Unique Characters : "+charSet);
		
	
		
		
		
	}

}
