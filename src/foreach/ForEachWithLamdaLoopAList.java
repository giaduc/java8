package foreach;

import java.util.List;

public class ForEachWithLamdaLoopAList {

	public static void main(String[] args) {
		List<String> items = DataToLoop.getList();
		
		// method reference
		items.forEach(System.out::println);
		
		// stream and filter
		items.stream().filter(i -> i.contains("B")).forEach(System.out::println);
		
	}
	
}
