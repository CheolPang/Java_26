package collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Exam03 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(5));
		scores.add(10);
		scores.add(1);
		scores.add(3);
		scores.add(5);
		System.out.println(scores);
		System.out.println("===숫자 내림차순===");
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println(descendingSet);

		System.out.println("===숫자 오름차순===");
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();

		TreeSet<String> names = new TreeSet<String>();
		names.add(new String("유재석"));
		names.add(new String("하하"));
		names.add(new String("정준하"));
		names.add(new String("노홍철"));
		names.add(new String("정형돈"));
		System.out.println(names);
		NavigableSet<String> descendingNames = names.descendingSet();
		System.out.println(descendingNames);
		// []에서 빼서 데이터를 출력 => 향상된 for문 사용하기
		for (String name : descendingNames)
			System.out.println(name);

	}
}
