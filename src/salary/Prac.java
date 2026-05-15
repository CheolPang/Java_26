package salary;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		int key;
		
		while(true) {
			System.out.println(" 1.입력\n 2.출력\n 3.종료");
			System.out.println("------------");
			System.out.println("번호 입력 : ");
			key = sc.nextInt();
			// 프로그램 종료
			if(key == 3) break;

			switch(key) {
			case 1: 
				controller.input();
				break;
			case 2: 
				controller.output();
				break;
			default: System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
