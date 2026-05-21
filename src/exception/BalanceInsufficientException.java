package exception;

//사용자 예외 클래스 만들기
public class BalanceInsufficientException extends Exception { // 일반예외로 선언하기 위해 Exception을 상속, 실행예외로 선언하려면
																// RuntimeException으로 상속
	BalanceInsufficientException() {
	}

	BalanceInsufficientException(String msg) {
		super(msg);
	}
}
