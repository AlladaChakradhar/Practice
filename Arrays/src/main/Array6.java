package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Duplicate in Array

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 12, 23, 34, 45, 56 };
		Set<Integer> uniq= new HashSet<>();
		
		boolean dupl=false;
		
		for(int num:nums) {
			if(!uniq.add(num)) {
				dupl=true;
			}
		}
		
		System.out.println(dupl);



	}

}
