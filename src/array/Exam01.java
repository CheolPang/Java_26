package array;

import java.util.Arrays;

public class Exam01 {
	public static void main(String[] args) {
		// 1.
		int[] hong = new int[3];
		hong[0] = 100;
		hong[1] = 90;
		hong[2] = 80;
		// 2.
		int[] lee;
		lee = new int[] { 100, 90, 80, 70 };
		// 3.
		int[] park = { 100, 90, 80 };
		// 4.
		int kim[] = { 100, 90, 80, 70 };

		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;

		// 개인별 총점 구하기
		for (int i = 0; i < 3; i++) {
			sum1 += hong[i];
		}
		System.out.println("홍길동의 총점: " + sum1);
		System.out.println("홍길동의 평균: " + sum1/hong.length);
		
		for (int i = 0; i < lee.length; i++) {
			sum2 += lee[i];
		}
		System.out.println("홍길동 배열의 값을 차례대로 출력==");
		for(int i=0; i<hong.length; i++) {
			System.out.println(hong[i]);
		}
		
		System.out.println("이씨의 총점: " + sum2);
		System.out.println("이씨의 평균: " + sum2/lee.length);
		System.out.println("==이씨 배열의 값을 차례대로 출력==");
		System.out.println(Arrays.toString(lee));
		System.out.println("=============");
		System.out.println(lee);
		lee[1]=100;
		System.out.println(Arrays.toString(lee));
		
		
		
		
	}

}
