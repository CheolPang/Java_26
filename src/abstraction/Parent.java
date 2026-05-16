package abstraction;

public abstract class Parent { // 추상메소드를 만들어두고 추상클래스로 선언 안하면 에러남.
	void show() {
		System.out.println("나는 부모인 추상 클래스이다.");
	}
	//추상 메소드 => 추상 메소드가 하나라도 있다면 그 클래스는 반드시 추상 클래스로 선언을 해야 한다!!
	abstract void call();
	//단, 추상클래스라도 추상메소드가 반드시 있어야 하는 것은 아니다.
}
