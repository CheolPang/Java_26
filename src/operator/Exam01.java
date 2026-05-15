package operator;

public class Exam01 {
	public static void main(String[] args) {
		int n1 = 100;
		System.out.println(n1);
		
		n1 = n1 + 100;
		System.out.println(n1);
		
		n1 += 100;
		System.out.println(n1);
		n1 -= 100;
		System.out.println(n1);
		n1 *= 100;
		System.out.println(n1);
		n1 /= 100;
		System.out.println(n1);
		n1 %= 100;
		System.out.println(n1);
		
		// 정수의 나눗셈
		System.out.println(5/2);
		
		// 실수의 나눗셈
		System.out.println(5.0/2.0);
		
		// 정수와 실수의 나눗셈
		System.out.println(5.0/2);
		System.out.println(5/2.0);
		
		// 정수를 0으로 나누면 에러 발생
//		System.out.println(5/0);
		
		// 실수를 0으로 나누면 에러 발생
		System.out.println(5.0/0);
		System.out.println(5.0/0.0);
		System.out.println(5/0.0);
		
		System.out.println("=========================");
		// 단항 연산자
		int n2 = 1;
		System.out.println(n2);
		n2++; // 후치형
		System.out.println(n2);
		++n2; // 전치형
		System.out.println(n2);
		
		// 후치형(후위)연산
		int a1 = 100;
		int x1 = 1;
		int y1 = a1 + x1++;
		System.out.println("x1="+x1);
		System.out.println("y1="+y1);

		// 전치형(전위)연산
		int a2 = 100;
		int x2 = 1;
		int y2 = a2 + ++x2;
		System.out.println("x2="+x2);
		System.out.println("y2="+y2);
		
		// 관계연산자
		System.out.println(5<3);
		System.out.println(5>3);
		System.out.println(5==3);
		System.out.println(5!=3);
		
		// 논리연산자
		int a = 100;
		int b = 200;
		int x = 5, y = 3;
		
		System.out.println((a>=b) && (x>=y));
		System.out.println((a>=b) || (x>=y));
		System.out.println(!(a>=b) || (x>=y));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
