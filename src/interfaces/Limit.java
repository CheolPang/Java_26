package interfaces;

public interface Limit { //인터페이스로 선언=>인터페이스란? 객체의 사용방법을 정의한 것이다.
	int MAX = 1000; //상수를 만들때 대문자를 사용한다. (원래는 public static final을 써야 상수로 처리되나, 대문자를 사용하면 컴파일 과정에서 자동으로 붙게 되므로 생략할 수 있다!!)
//	int MIN; // 초기화를 안할 수가 없다. 선언과 동시에 반드시 초기화가 필요하다.
	int MIN = 0;
	
}
