package main;

import java.util.Scanner;

//Find the maximum & minimum number in an array of integers. 

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int max=0;
		
		int[] nums=new int[size];
		
		for(int i=0;i<size;i++) {
			nums[i]=sc.nextInt();
		}
		int min=nums[0];
		for(int i=0;i<size;i++) {
			if(nums[i]>max) {  
				max=nums[i];	
			}
			
			if(min>=nums[i]) {
				min=nums[i];
			}
			
		}
		
		System.out.println("Minimum number :" +min);
		System.out.println("Maximum number :" +max);
		


	}

}
