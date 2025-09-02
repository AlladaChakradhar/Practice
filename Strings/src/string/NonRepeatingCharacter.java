package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		str=str.trim();

//		String str= " Java articles Java"
		char[] chars = str.toCharArray();
		List<Character> rep = new ArrayList<>();
		List<Character> firstNon = new ArrayList<>();
		for (char ch : chars) {
			if (!firstNon.contains(ch)) {
				firstNon.add(ch);
			} else {
				rep.add(ch);
			}
		}		
		Optional<Character> nonRep = firstNon.stream().filter(s -> !rep.contains(s)).findFirst();
		if(nonRep.isPresent()) 
		System.out.println(nonRep.get());
		else
			System.out.println("No non repeat character");

	}

}
