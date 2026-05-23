package collection.score;

import java.util.Scanner;

public class Exam extends ScoreImpl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key;
		ScoreImpl impl = new ScoreImpl();
		while (true) {
			System.out.println("1.입력\n2.출력\n3.학번검색\n4.이름검색\n5.총점 내림차순 정렬\n6.총점 오름차순 정렬\n7. 파일 저장\n8.파일 읽기\n9.종료");
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
				impl.searchHak();

				break;
			case 4:
				impl.searchName();

				break;
			case 5:
				impl.descSortTot();

				break;
			case 6:
				impl.ascSortHak();
				break;
			case 7:
				impl.saveFile();

				break;
			case 8:
				impl.readFile();

				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
