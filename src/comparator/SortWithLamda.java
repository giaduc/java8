package comparator;

import java.util.List;

public class SortWithLamda {

	public static void main(String[] args) {
		
		List<Deverloper> deverlopers = Deverloper.getDeverlopers();
		
		System.out.println("Before sort...");
		for (Deverloper d : deverlopers) {
			System.out.println(d);
		}
		
		// sort with lamda
		deverlopers.sort((Deverloper d1, Deverloper d2) -> d1.getAge() - d2.getAge());
		
		System.out.println("After sort...");
		// java 8 only, print the list
		deverlopers.forEach(System.out::println);
		
	}
	
}
