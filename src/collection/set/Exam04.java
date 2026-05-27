package collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Exam04 {
	public static void main(String[] args) {
		// TreeSet이 가지고 있는 범위검색과 관련된 메소드들
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("pineapple");
		treeSet.add("cherry");
		treeSet.add("banana");
		treeSet.add("mango");
		treeSet.add("c");
		System.out.println(treeSet);

		System.out.println("==c보다 아래 있는 단어 검색==");
		NavigableSet<String> headFruits = treeSet.headSet("c", true);
		System.out.println(headFruits);

		System.out.println("==c보다 위에 있는 단어 검색==");
		NavigableSet<String> tailFruits = treeSet.tailSet("c", true);
		System.out.println(tailFruits);

		System.out.println("==b~d 사이에 있는 단어 검색==");
		NavigableSet<String> rangeFruits = treeSet.subSet("b", true, "d", true);
		System.out.println(rangeFruits);
	}
}
