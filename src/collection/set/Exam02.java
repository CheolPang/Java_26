package collection.set;

import java.util.HashSet;
import java.util.Set;

public class Exam02 {
	public static void main(String[] args) {
		Member mem1 = new Member("현빈", 45);
		Member mem2 = new Member("손예진", 43);
		Member mem3 = new Member("손예진", 43);

		System.out.println();
		Set<Member> set = new HashSet<Member>();

		set.add(mem1);
		set.add(mem2);
		set.add(mem3);
		set.add(new Member("고소영", 46));
		System.out.println(set.size());
		System.out.println(set);

		System.out.println(mem1.hashCode());
		System.out.println(mem2.hashCode());
		System.out.println(mem3.hashCode());
		System.out.println(mem1.equals(mem2));
		System.out.println(mem2.equals(mem3));
		// age, name 값이 같으면 true를 리턴하도록 오버라이드함

	}
}
