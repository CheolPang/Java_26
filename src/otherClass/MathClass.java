package otherClass;

import java.util.Random;

public class MathClass {
	static int random(int min, int max) {
		int num = (int) (Math.random() * (max - min));
		return num;
	}

	public static void main(String[] args) {
		/*
		 * System.out.println(Math.abs(-10.5)); System.out.println(Math.ceil(-10.5));
		 * //celling System.out.println(Math.floor(-10.5)); //내림
		 * System.out.println(Math.max(-10.5, 54545)); // 최대값
		 * System.out.println(Math.min(-10.5, 54545)); // 최소값
		 * System.out.println(Math.pow(2, 3)); // 제곱
		 * System.out.println(Math.round(5.5545487746)); // 반올림
		 * System.out.println(Math.sqrt(5.5545487746)); // 루트
		 * System.out.println(Math.rint(5.5545487746)); // 가까운 정수의 실수값
		 * System.out.println(Math.rint(5.232487746)); // 가까운 정수의 실수값
		 * System.out.println(Math.random()); // 랜덤 수
		 * 
		 * 
		 * // 특정 범위의 임의의 정수 만들기 System.out.println(MathClass.random(5, 10));
		 * 
		 * //랜덤 클래스 Random r = new Random(); System.out.println(r.nextInt());
		 * System.out.println(r.nextInt(10));
		 */

		// 1~45까지의 수가 5반 나오게 로또번호생성기 구현
		// 예) 40 32 1 5 7
		for (int i = 0; i < 5; i++) {
			System.out.print(MathClass.random(1, 45) + " ");
		}

	}

}
