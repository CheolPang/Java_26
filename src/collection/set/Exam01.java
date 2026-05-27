package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("샴푸");
		set.add("컨디셔너");
		set.add("칫솔");
		set.add("샴푸");
		
		int size = set.size();
		System.out.println("객체의 총 갯수"+size);
		System.out.println(set.toString());
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String item = iter.next();
			System.out.println(item);
		}
		set.remove("샴푸");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		if(set.isEmpty()) {
			System.out.println("모두 비어있음");
		}
	}
}
