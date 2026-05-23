package collection.list;

import java.util.Comparator;

public class People implements Comparator<People> {
	private String name;
	private String phone;
	private int age;

	public People(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}

	@Override
	public int compare(People o1, People o2) {
		return o1.getAge() < o2.getAge() ? 1 : -1;
		//return o1.getName().compareTo(o2.getName());
	}
	/*
	@Override
	public int compareTo(People o) {
		if (age < o.age)
			return -1;
		else if (age == o.age)
			return 0;
		else
			return 1;
	} */
	
	
}
