package string;

public class Reversal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1st Approach....
		
		String s1="hello";		
		String s2=" ";
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			s2=ch+s2;	
		}
		System.out.println(s2);
		
//		2nd Approach.............
//		
//		StringBuilder s1= new StringBuilder("hello");
//		StringBuilder reversed = s1.reverse();
//		
//		System.out.println(reversed);
		
//		3rd Approach.............
		
//		String s1="hello";
//		char[] ch= s1.toCharArray();
//		
//		for(int i=ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]);
//		}

	}

}
