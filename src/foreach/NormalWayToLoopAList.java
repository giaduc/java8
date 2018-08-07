package foreach;

import java.util.List;

public class NormalWayToLoopAList {
	
	public static void main(String[] args) {
		List<String> items = DataToLoop.getList();
		for (String item : items) {
			System.out.println(item);
		}
		
	}
	
}
