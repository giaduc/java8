package foreach;

import java.util.Map;

public class ForEachWithLamdaLoopAMap {

	public static void main(String[] args) {
		Map<String, Integer> items = DataToLoop.getMaps();

		items.forEach((k, v) -> System.out.println("Item: " + k + " Count: " + v));
	}
	
}
