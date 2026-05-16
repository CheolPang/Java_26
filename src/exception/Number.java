package exception;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 연도를 입력해주세요.");
		try {
			int year = sc.nextInt();
			int age = 2026-year;
			System.out.println("내 나이: "+age);
		} catch(Exception e) {
			System.out.println("에러발생 : 다시 실행하여 숫자만 정확하게 입력해주세요.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
