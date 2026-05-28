package lambda;

interface MyValue{
	int getValue();
}

public class Exam01 {
	//람다식: 익명함수를 생성하기 위한 식
	/*Runnable runnable = new Runnable() {
	 	public void run(){...}
	 }
	 =>Runnable runnable = () -> {...}
	 ** 람다 표현식 사용순서
	 1) 인터페이스 만들기
	 2) 인터페이스 참조 변수 만들기
	 3) 인터페이스 참소 변수에 람다 표현식 할당 하기
	 4) 람다 표현식 수행시키기 
	 */
	public static void main(String[] args) {
		MyValue mv;
		mv = () -> 100;
		System.out.println(mv.getValue());
	}
}
