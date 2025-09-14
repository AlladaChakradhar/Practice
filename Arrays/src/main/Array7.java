package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Chocolate Distribution

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 7, 3, 2, 4, 9, 12, 56 };
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int dmin=Integer.MAX_VALUE;
		for (int i = 0; i <= nums.length - k; i++) {
			int max = 0;
			int min = nums[i];
			for (int j = i; j < i + k; j++) {
				if (nums[j] > max) max = nums[j];
				if (min >= nums[j])min = nums[j];
			}
			int diff = max - min;
			if(diff<dmin) dmin=diff;
		}
		System.out.println(dmin);

	}

}
