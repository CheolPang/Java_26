package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam01 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "내옷");
		map.put(20, "엄마가방");
		map.put(21, "아빠옷");
		map.put(21, null);
		map.put(30, "아빠옷");
		map.put(40, "아빠옷");
		// Value 값은 중복이 가능하다.
		// 다만 같은 Key 값에 중복된 경우, 나중에 입력된 값으로 덮어씌워진다.

		System.out.println("===데이터 확인===");
		System.out.println(map);
		System.out.println(map.get(10));
		Set<Integer> set = map.keySet();
		System.out.println(set);
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(key+":"+map.get(key));
		}
		System.out.println(map.size());
		System.out.println(map.remove(10));
		map.clear();
		System.out.println(map);
		if(map.isEmpty()) {
			System.out.println("모두 비어있음");
		}
	}
}
