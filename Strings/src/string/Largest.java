package string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(12,23,34,45,56,65,47);
		List<Integer> list1 = Arrays.asList(13,22,35,46,55,64,48);
		
		
//		int largest=list.stream().sorted().toList().getLast();
		List<Integer> l1=list.stream().sorted().collect(Collectors.toList());
		List<Integer> l2=list.stream().sorted().collect(Collectors.toList());
		l1.addAll(l2);
		
		
		System.out.println(l1);

	}

}
