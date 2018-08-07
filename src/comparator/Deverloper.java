package comparator;

import java.util.ArrayList;
import java.util.List;

public class Deverloper {

	private int age;
	private String name;

	public Deverloper() {
		super();
	}

	public Deverloper(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Deverloper [age=" + age + ", name=" + name + "]";
	}

	public static List<Deverloper> getDeverlopers() {
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
