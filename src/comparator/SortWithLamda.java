package comparator;

import java.util.List;

public class SortWithLamda {

	public static void main(String[] args) {

		List<Deverloper> deverlopers = Deverloper.getDeverlopers();

		System.out.println("Before sort...");
		for (Deverloper d : deverlopers) {
			System.out.println(d);
		}

		// sort by age with lamda
		deverlopers.sort((d1, d2) -> d1.getAge() - d2.getAge());
		
		// sort by name with lamda
		deverlopers.sort((d1, d2) -> d1.getName().compareTo(d2.getName()));

		System.out.println("After sort...");
		// java 8 only, print the list
		deverlopers.forEach(System.out::println);

	}

}
