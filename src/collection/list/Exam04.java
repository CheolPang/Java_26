package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
// import java.util.Vector;

public class Exam04 {
	public static void main(String[] args) {
		List<People> plist = new ArrayList<People>();
		
		People p1 = new People("정우성", "010-1111-2222", 40);
		plist.add(p1);
		People p2 = new People("성시경", "010-3333-2222", 35);
		plist.add(p2);
		People p3 = new People("이정재", "010-5555-2222", 43);
		plist.add(p3);
		People p4 = new People("강동원", "010-7777-2222", 38);
		plist.add(p4);
		
		for(People p : plist) System.out.println(p.toString());
		
		System.out.println("==============");
		Comparator<People> comp = new Comparator<People>() {
			
			@Override
			public int compare(People o1, People o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(plist, comp);
		Iterator<People> iter = plist.iterator();
		while(iter.hasNext()) {
			People p = iter.next();
			System.out.println(p);
			
		}
	}
}
