package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		
		List<String> result = lines.stream().filter(line -> !line.equals("mkyong")).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		List<Person> persons = Person.getPersons();
		
		Person result1 = persons.stream().filter(p -> "some".equals(p.getName())).findAny().orElse(null);
		System.out.println(result1);
		
		
	}
}
