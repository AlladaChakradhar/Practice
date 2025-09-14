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
		int[] differ = new int[nums.length + 1 - k];
		for (int i = 0; i <= nums.length - k; i++) {
//			System.out.print("[");
			int max = 0;
			int min = nums[i];
			for (int j = i; j < i + k; j++) {
				int diff = 0;
//				System.out.print(nums[j]);
//				if (j < i + k - 1) {
//					System.out.print(",");
//					break;
//				}
				if (nums[j] > max) {
					max = nums[j];
				}
				if (min >= nums[j]) {
					min = nums[j];
				}
			}
			int diff = max - min;
			differ[i] = diff;
//			System.out.println("] ---> diff :" + diff);
		}

		int dmin = differ[0];
		for (int i = 0; i < differ.length; i++) {
			if (dmin >= differ[i]) {
				dmin = differ[i];
			}
		}
		System.out.println(dmin);

	}

}
