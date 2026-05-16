package abstraction;

public class Child extends Parent {

	// 추상 메소드를 가진 추상 클래스를 상속 시 자식은 꼭 부모의 추상 메소드를 오버라이드 해야 한다!! 혹은, 자식클래스도 추상클래스로
	// 만들어버리면 된다. (잘 쓰이지 않는 방법)
	@Override
	void call() {
		System.out.println("나는 부모 추상 메소드를 \n오버라이드한 자식 메소드");
	}
	
	void Print() {
		System.out.println("나는 자식 메소드");
	}
}
