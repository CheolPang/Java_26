package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
		ArrayList<Integer> listNum = new ArrayList<Integer>();
		listNum.add(10);
		listNum.add(20);
		listNum.add(null);
		listNum.add(40);
		listNum.add(50);
		System.out.println(listNum.toString());
		listNum.add(2, 30);
		System.out.println(listNum.toString());
		listNum.add(10);
		System.out.println(listNum.toString());
		
		List<String> travelList = new ArrayList<String>(15);
		travelList.add("일본");
		travelList.add("스위스");
		travelList.add("캐나다");
		travelList.add("오스트리아");
		travelList.add("영국");
		System.out.println(travelList.toString());
	}
}
