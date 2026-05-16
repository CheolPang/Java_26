package interfaces;

public class MyClass {
	// 인터페이스로 구현 객체를 사용하는 방법 4가지
	// 1)인터페이스를 필드타입으로 사용 시 필드에 구현 객체를 대입할 수 있다!
	RemoteControl rc = new Televison();

	// 2)인터페이스를 생성자의 매개변수 타입으로 사용
	public MyClass() {
	}

	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(54); 
	}
	//3)인터페이스를 로컬 변수 타입으로 사용
	void play() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(-30);
	}
	
	//4)인터페이스를 메소드의 매개변수 타입으로 사용
	void play(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(50);
	}
}
