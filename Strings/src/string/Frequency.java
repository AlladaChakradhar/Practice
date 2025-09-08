package string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
		
//		long count = words.stream().filter(s->words.contains(s)).count();
		Map<String, Long> count = words.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		
		System.out.println(count);

	}

}
