package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithoutLamda {

	public static void main(String[] args) {

		List<Deverloper> deverlopers = Deverloper.getDeverlopers();

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

		// sort by age - java 8
		deverlopers.sort(new Comparator<Deverloper>() {

			@Override
			public int compare(Deverloper o1, Deverloper o2) {
				return o1.getAge() - o2.getAge();
			}

		});

		// sort by name
		Collections.sort(deverlopers, new Comparator<Deverloper>() {

			@Override
			public int compare(Deverloper o1, Deverloper o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});

		System.out.println("After sort");
		for (Deverloper d : deverlopers) {
			System.out.println(d);
		}

	}

}
