package streamfilter;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap {

	public static void main(String[] args) {
		List<Person> persons = Person.getPersons();
		
		String name = persons.stream().filter(p -> "some".equals(p.getName())).map(Person::getName).findAny().orElse("");
		System.out.println(name);
		
		List<String> names = persons.stream().map(Person::getName).collect(Collectors.toList());
		names.forEach(System.out::println);
	}
	
}
