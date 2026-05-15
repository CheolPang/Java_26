package operator;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 사용자에게 값을 입력받아서 활용하는 예제
		Scanner sc = new Scanner(System.in);
		
		
		// 1. 변수 선언
		int num1, num2;
		double num3;
		
		// 2. 사용자에게 값을 입력받음
		System.out.println("정수를 입력하세요: ");
		num1 = sc.nextInt();
		System.out.println("정수를 하나 더 입력하세요: ");
		num2 = sc.nextInt();
		System.out.println("실수를 하나 입력하세요: ");
		num3 = sc.nextDouble();
		
		// 3. 연산 후 출력
/*		System.out.println(num1 + num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		System.out.println("==========");
		System.out.println(num1 + num3);
		System.out.println(num1 / num3);
		System.out.println(num1 % num3); */
		
		// 입력받은 정수 데이터 중에서 큰 값을 저장해서 출력하기
		int result;
		result = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수: "+result);
		
	}
}
