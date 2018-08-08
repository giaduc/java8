package streammap;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfObject {

	public static void main(String[] args) {
		List<Staff> staffs = Staff.getStaffs();
		
		// list object to list string
		staffs.stream().map(Staff::getName).forEach(System.out::println);
		
		// list object to list other object
		List<Staff> otherStaffs = staffs.stream().map(s -> {
			Staff o = new Staff();
			o.setAge(s.getAge());
			o.setName(s.getName());
			
			if ("ok".equals(s.getName())) {
				o.setName("not ok");
			}
			
			return o;
		}).collect(Collectors.toList());
		
		otherStaffs.forEach(System.out::println);
	}
}
