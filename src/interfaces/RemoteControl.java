package interfaces;

public interface RemoteControl { //인터페이스란 객체의 사용 설명서의 역할
	// 상수
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	// 추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int vol);
}
