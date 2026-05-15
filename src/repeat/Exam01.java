package repeat;

public class Exam01 {

	public static void main(String[] args) {
		// 1~10까지의 총합
		int i; // 전역변수
		int sum = 0;
		
		for(i=1; i<=10; i++) {
			sum += i;
			System.out.println("sum : " + sum);
			System.out.println("i : " + i);
		}
		System.out.println("sum에 담긴 최종값: " + sum);
		System.out.println("i에 담긴 최종값: " + i);
	}

}
