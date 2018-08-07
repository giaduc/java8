package foreach;

import java.util.Map;

public class NormalWayToLoopAMap {

	public static void main(String[] args) {
		Map<String, Integer> items = DataToLoop.getMaps();
		
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item: " + entry.getKey() + " Count: " + entry.getValue());
		}
	}
	
}
