package repeat;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력할 숫자를 담을 변수 선언
		int key = 0;
		
		while(true) {
			System.out.println("============");
			System.out.println(" 1.입력\n 2.검색\n 3.삭제\n 4.종료");
			System.out.println("============");
			System.out.println("번호를 입력해주세요.");
			key = sc.nextInt();
			// 프로그램 종료
			if(key == 4) break;
			
			switch(key) {
			case 1: System.out.println("\n입력을 선택하였습니다.\n"); break;
			case 2: System.out.println("\n검색을 선택하였습니다.\n"); break;
			case 3: System.out.println("\n삭제를 선택하였습니다.\n"); break;
			default: System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
