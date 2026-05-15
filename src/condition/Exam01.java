package condition;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요리 점수 입력: ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A등급입니다.");
			System.out.println("참 잘했습니다.");
		} else if(score >= 80) {
			System.out.println("B등급입니다.");
		} else if(score >= 70) {
			System.out.println("C등급입니다.");
		} else if(score >= 60) {
			System.out.println("D등급입니다.");
		} else {
			System.out.println("F등급입니다.");
		}
	}
}
