package collection.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class CustomImpl implements Custom {
	private List<CustomVO> list = new ArrayList<CustomVO>();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void input() {
		CustomVO vo = new CustomVO();
		System.out.print("고객번호 : ");
		vo.setNumber(sc.next());
		System.out.print("고객이름 : ");
		vo.setNamel(sc.next());
		System.out.print("고객전화번호 : ");
		vo.setCall(sc.next());

	}

	@Override
	public void print() {
		for(int i=0; i<list.size(); i++) {
			CustomVO vo = list.get(i);
			System.out.println(vo.toString());
		}

	}

	@Override
	public void printTitle() {
		String str = String.format("%5s %5s %5s", "고객번호", "이름", "전화번호");
		System.out.println(str);
	}

	@Override
	public void searchNumber() {
		System.out.print("고객번호 입력:");
		String number = sc.next();
		for (int i = 0; i < list.size(); i++) {
			CustomVO vo = list.get(i);
			if (number.equals(vo.getNumber())) {
				printTitle();
				System.out.println(vo.toString());
			}
		}

	}

	@Override
	public void searchName() {
		System.out.print("고객이름 입력:");
		String name = sc.next();
		for (int i = 0; i < list.size(); i++) {
			CustomVO vo = list.get(i);
			if (name.equals(vo.getNamel())) {
				printTitle();
				System.out.println(vo.toString());
			}
		}
	}

	@Override
	public void searchCall() {
		System.out.print("고객전화번호 입력:");
		String call = sc.next();
		for (int i = 0; i < list.size(); i++) {
			CustomVO vo = list.get(i);
			if (call.equals(vo.getCall())) {
				printTitle();
				System.out.println(vo.toString().contains(call));
			}
		}

	}

	@Override
	public void descSortName() {
		Comparator<CustomVO> comp = new Comparator<CustomVO>() {
			
			@Override
			public int compare(CustomVO o1, CustomVO o2) {
				return o2.getNamel().compareTo(o1.getNamel());
			}
		};
		Collections.sort(list, comp);
		print();

	}

	@Override
	public void ascSortNumber() {
		Comparator<CustomVO> comp = new Comparator<CustomVO>() {
			
			@Override
			public int compare(CustomVO o1, CustomVO o2) {
				return o2.getNamel().compareTo(o1.getNamel());
			}
		};
		Collections.sort(list, comp);
		print();

	}

}
