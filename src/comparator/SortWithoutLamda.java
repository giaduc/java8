package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithoutLamda {
	
	public static void main(String[] args) {
		List<Deverloper> deverlopers = getDeverlopers();
		
		System.out.println("Before sort.");
		for (Deverloper d : deverlopers) {
			System.out.println(d);
		}
		
		// sort by age
		Collections.sort(deverlopers, new Comparator<Deverloper>() {

			@Override
			public int compare(Deverloper o1, Deverloper o2) {
				return o1.getAge() - o2.getAge();
			}
			
		});
		
		System.out.println("After sort");
		for (Deverloper d : deverlopers) {
			System.out.println(d);
		}
		
	}
	
	private static List<Deverloper> getDeverlopers(){
		List<Deverloper> deverlopers = new ArrayList<Deverloper>();
		deverlopers.add(new Deverloper(20, "solae"));
		deverlopers.add(new Deverloper(85, "qwesdfg"));
		deverlopers.add(new Deverloper(42, "soqwefalae"));
		deverlopers.add(new Deverloper(48, "aersdfg"));
		deverlopers.add(new Deverloper(34, "qesaf"));
		deverlopers.add(new Deverloper(48, "qerhr"));
		deverlopers.add(new Deverloper(25, "aerdr"));
		deverlopers.add(new Deverloper(52, "turirte"));
		deverlopers.add(new Deverloper(16, "nasf"));
		deverlopers.add(new Deverloper(68, "reyua"));
		deverlopers.add(new Deverloper(75, "qerdf"));
		return deverlopers;
	}
	
}
