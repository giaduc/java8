package foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataToLoop {

	public static Map<String, Integer> getMaps() {
		Map<String, Integer> items = new HashMap<>();

		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		items.put("G", 70);
		items.put("H", 80);
		items.put("I", 90);
		items.put("J", 100);
		items.put("K", 110);

		return items;
	}
	
	public static List<String> getList(){
		List<String> items = new ArrayList<String>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		items.add("F");
		items.add("G");
		items.add("H");
		items.add("I");
		items.add("J");
		items.add("K");
		
		return items;
	}
	
}
