package streammap;

import java.util.ArrayList;
import java.util.List;

public class Staff {

	private String name;
	private int age;

	public Staff() {
		super();
	}

	public Staff(String name, int age) {
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
		return "Staff [name=" + name + ", age=" + age + "]";
	}
	
	public static List<Staff> getStaffs(){
		List<Staff> staffs = new ArrayList<Staff>();
		staffs.add(new Staff("some", 45));
		staffs.add(new Staff("thing", 36));
		staffs.add(new Staff("went", 14));
		staffs.add(new Staff("wrong", 69));
		staffs.add(new Staff("here", 84));
		staffs.add(new Staff("ok", 35));
		
		return staffs;
	}

}
