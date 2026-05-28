package lambda;

//람다식의 타겟 타입 = 람다식이 대입될 인터페이스
//함수적 인터페이스 : 하나의 추상 메소드가 선언된 인터페이스만이 람다식의 타겟 타입이 될 수 있다.

@FunctionalInterface
interface MyValue2{
	double getValue(int n);
//	int get();
}

public class Exam02 {
	public static void main(String[] args) {
		MyValue2 mv2;
		mv2 = (n) -> 1.0/n;
		System.out.println(mv2.getValue(5));
		System.out.println(mv2.getValue(10));
		System.out.println(mv2.getValue(100));
		System.out.println(mv2.getValue(200));
	}
}
