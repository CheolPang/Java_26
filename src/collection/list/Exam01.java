package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
		List<Integer> listNum = new ArrayList<Integer>();
		listNum.add(10);
		listNum.add(20);
		listNum.add(null);
		listNum.add(40);
		listNum.add(50);
		System.out.println(listNum.toString());
		listNum.add(2, 30);
		listNum.set(3, 100);
		System.out.println(listNum.toString());
		listNum.add(10);
		System.out.println(listNum.toString());

		List<String> travelList = new ArrayList<String>(15);
		travelList.add("일본");
		travelList.add("스위스");
		travelList.add("캐나다");
		travelList.add("오스트리아");
		travelList.add("영국");
		travelList.add("영국");
		System.out.println(travelList.toString());
		System.out.println(travelList.get(2));
		for(int i = 0; i<travelList.size(); i++) {
			System.out.println(travelList.get(i));
		}
		travelList.remove(0);
		System.out.println(travelList.toString());
		travelList.clear();
		System.out.println(travelList.toString());
	}
}
