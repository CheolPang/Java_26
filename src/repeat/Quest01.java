package repeat;

import java.util.Scanner;

public class Quest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jango = 0;
		int inYe;
		int inCh;
		
		// 사용자가 입력할 숫자를 담을 변수 선언
		int key = 0;
		
		while(true) {
			System.out.println("============");
			System.out.println(" 1.예금 2.출금 3.잔고 4.종료");
			System.out.println("============");
			System.out.println("번호 선택:");
			key = sc.nextInt();
			// 프로그램 종료
			if(key == 4) break;
			
			switch(key) {
			case 1: 
				System.out.println("\n예금액: \n");
				inYe = sc.nextInt(); 
				jango += inYe; break;
			case 2: System.out.println("\n출금액: \n");
				inCh = sc.nextInt(); 
				jango -= inCh; break;
			case 3: System.out.println("\n잔고액: \n" + jango); break;
			default: System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
