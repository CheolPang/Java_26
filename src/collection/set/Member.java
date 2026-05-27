package collection.set;

import java.util.Objects;

public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
		// age, name 값이 같으면 동이한 hasCode가 리턴되도록 오버라이드함.
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
		// age, name 값이 같으면 true를 리턴하고록 오버라이드0함.
	}
	
	
	
	
}
