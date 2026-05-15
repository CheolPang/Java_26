package operator;

import java.util.Scanner;

public class Exam05_selfEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 생성자 함수를 이용하여 객체를 생성
		// 1. 변수 선언
		Double mit;
		Double nop;
		Double result;
		// 2. 입력받아 변수에 데이터를 저장
		System.out.println("밑변의 길이를 실수(cm)로 입력하세요.");
		mit = sc.nextDouble();
		System.out.println("높이의 길이를 실수(cm)로 입력하세요.");
		nop = sc.nextDouble();
		
		// 3. 연산: 저장된 데이터를 가공하기
		result = mit * nop / 2;
		// 4. 출력 : 저장된 데이터와 결과값 확인
		System.out.println("입력한 데이터를 가지고 생성한 삼각형의 넓이는? : "+ result +"(cm) 입니다.");
		
		sc.close(); // 자원절약을 위해 다 쓰면 닫아줘야함.
	}

}
