package collection.custom;

import java.util.Scanner;


public class Prac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key;
		CustomImpl impl = new CustomImpl();
		while (true) {
			System.out.println("1.입력\n2.출력\n3.고객번호 검색\n4.이름 검색\n5.전화번호 검색\n6.이름을 내림차순으로 정렬\n7. 고객번호를 오름차순으로 정렬\n8.종료");
			System.out.println("------------");
			System.out.print("번호 : ");
			key = sc.nextInt();

			// 프로그램 종료
			if (key == 3)
				break;

			switch (key) {
			case 1:
				impl.input();

				break;
			case 2:
				impl.printTitle();
				impl.print();

				break;
			case 3:
				impl.searchNumber();

				break;
			case 4:
				impl.searchName();

				break;
			case 5:
				impl.searchCall();

				break;
			case 6:
				impl.descSortName();
				break;
			case 7:
				impl.ascSortNumber();

				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
