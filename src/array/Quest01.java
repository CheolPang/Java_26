package array;

import java.util.Scanner;

public class Quest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] student = new int[5];
		int sum = 0;
		
		System.out.println("1번 학생의 점수를 입력: ");
		student[0] = sc.nextInt();
		System.out.println("2번 학생의 점수를 입력: ");
		student[1] = sc.nextInt();
		System.out.println("3번 학생의 점수를 입력: ");
		student[2] = sc.nextInt();
		System.out.println("4번 학생의 점수를 입력: ");
		student[3] = sc.nextInt();
		System.out.println("5번 학생의 점수를 입력: ");
		student[4] = sc.nextInt(); 
		
		// 향상된 for문
	/*	for(int score : student) {
			sum += score;
		}*/
		
		sum = student[0] + student[1] + student[2] + student[3] + student[4];
		System.out.println("총점: "+sum+", 평균: "+((double)sum/student.length));
		

	}

}
