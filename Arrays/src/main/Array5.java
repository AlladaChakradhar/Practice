package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Reverse Array

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 12, 23, 34, 45, 56 };
		int[] reverse = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			reverse[nums.length - 1 - i] = nums[i];
		}

		System.out.println(Arrays.toString(reverse));

	}

}
