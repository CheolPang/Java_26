package otherClass;

import java.util.Scanner;

public class Exam01_SelfEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pc = MathClass.random(1, 45);
		System.out.println("***컴퓨터가 선택한 수를 맞춰 보세요***\n----------------");
		System.out.println("1과 100사이의 값을 추측하여 입력해보세요.");
		int type = sc.nextInt();
		int sido = 1;
		
		while(true) {
			if (type < pc) {
				System.out.println("더 큰 수를 입력하세요.");
				type = sc.nextInt();
				sido += 1;
			} else if (type > pc) {
				System.out.println("더 작은 수를 입력하세요.");
				type = sc.nextInt();
				sido += 1;
			} else {
				System.out.println("컴퓨터가 선택한 수를 맞췄습니다.\n당신이 시도한 횟수는 "+sido+"번 입니다."); 
				break;
			}
		}
	}
}

