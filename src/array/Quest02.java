package array;

import java.util.Scanner;

public class Quest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] jucha = new boolean[5];
		
		// 사용자가 입력할 숫자를 담을 변수 선언
		int key = 0;
		int juchaKey = 0;
		
		while(true) {
			System.out.println("주차 관리 프로그램");
			System.out.println("************");
			System.out.println(" 1.입차\n 2.출차\n 3.리스트\n 4.종료");
			System.out.println("************");
			System.out.println("메뉴:");
			key = sc.nextInt();
			// 프로그램 종료
			if(key == 4) break;
			
			switch(key) {
			case 1: 
				System.out.println("위치 입력[1~5]");
				juchaKey = sc.nextInt();
				if(jucha[juchaKey-1] == true) {
					System.out.println(juchaKey+"위치에 이미 입차 / 주차되어 있습니다.");
				} else {
					jucha[juchaKey-1] = true;
					System.out.println(juchaKey+"위치에 입차 / 주차되었습니다.");
				}
				
				
				
				break;
			case 2: 
				System.out.println("위치 입력[1~5]");
				juchaKey = sc.nextInt();
				jucha[juchaKey-1] = false;
				System.out.println(juchaKey+"위치에 출차 / 출차되었습니다.");
				
				break;
			case 3: 
				System.out.println("\n--- 리스트 ---\n");
				System.out.println("1위치 : "+ jucha[0]);
				System.out.println("2위치 : "+ jucha[1]);
				System.out.println("3위치 : "+ jucha[2]);
				System.out.println("4위치 : "+ jucha[3]);
				System.out.println("5위치 : "+ jucha[4]);
				break;
			default: System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
