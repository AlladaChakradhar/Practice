package main;

import java.util.Scanner;

//Take an array as input from the user. Search for a given number x and print the index at which it occurs

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		
		int[] nums=new int[size];
		
		for(int i=0;i<size;i++) {
			nums[i]=sc.nextInt();
		}
		
		int searchNum=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			if(nums[i]==searchNum) {
				System.out.println("Number at "+i +" index");
			}
		}
		System.out.println("Number not found");
		
		

	}

}
