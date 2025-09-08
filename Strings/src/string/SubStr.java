package string;

import java.util.Scanner;

public class SubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String str1 = sc.next();
		String str2= sc.next();
		
		if(str1.contains(str2)) {
			System.out.println(str1.indexOf(str2));
		}
		else if(str2.isEmpty()||str2.isBlank()){
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}

	}

}
