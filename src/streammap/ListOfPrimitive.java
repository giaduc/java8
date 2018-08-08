package streammap;

import java.util.Arrays;
import java.util.List;

public class ListOfPrimitive {

	public static void main(String[] args) {
		
		// upper case list string
		List<String> strs = Arrays.asList("a", "b", "c", "d", "e");
		strs.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		
		// double list integer
		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6 , 7);
		ints.stream().map(i -> i * 2).forEach(System.out::println);
	}
	
}
