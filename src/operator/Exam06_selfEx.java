package operator;

import java.util.Scanner;

public class Exam06_selfEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double kor, eng, math, pyeong;
		
		System.out.println("국어 점수: ");
		kor = sc.nextDouble();
		System.out.println("영어 점수: ");
		eng = sc.nextDouble();
		System.out.println("수학 점수: ");
		math = sc.nextDouble();
		
		System.out.println("성적표를 부모님께 보여드렸나요? true 또는 false로 입력하세요.");
		boolean isView = sc.nextBoolean();
		
		System.out.println("A등급부터 F등급까지 예상되는 등급을 문자 한 개로 입력하세요.");
		char deung = sc.next().charAt(0);
		
		pyeong = (kor + eng + math) / 3;
		
		if (pyeong >= 60) {
			if (40 < kor && 40 < eng && 40 < math) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			} 
		} else {
			System.out.println("불합격");
		}
		System.out.println("보여드렸나요? : " + isView);
		System.out.println("예상등급: " + deung);
	} 
}
