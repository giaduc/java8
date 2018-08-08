package streamfilter;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static List<Person> getPersons() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("some", 15));
		persons.add(new Person("thing", 22));
		persons.add(new Person("went", 45));
		persons.add(new Person("wrong", 32));
		persons.add(new Person("here", 65));
		persons.add(new Person("oops", 49));
		
		return persons;
	}
	
}
