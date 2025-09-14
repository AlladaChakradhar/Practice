package main;

import java.util.Scanner;

//Take an array of numbers as input and check if it is an array sorted in ascending order.


public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int[] nums=new int[size];		
		for(int i=0;i<size;i++) {
			nums[i]=sc.nextInt();
		}
		boolean isAsc=true;
		for(int i=0;i<size-1;i++) {
			if(nums[i]>nums[i+1]) {
				isAsc=false;
			}
		}
		
		if(isAsc) {
			System.out.println("Ascending order");
		}else {
			System.out.println("Not Ascending order");
		}
		
		
		
		
		


	}

}
