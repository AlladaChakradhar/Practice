package main;

import java.util.Scanner;

//Take an array of names as input from the user and print them on the screen.


public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		
		String[] names=new String[size];
		
		for(int i=0;i<size;i++) {
			names[i]=sc.next();
		}
		
		for(int i=0;i<size;i++) {
			System.out.println(names[i]);
		}

	}

}
