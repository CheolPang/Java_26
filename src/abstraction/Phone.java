package abstraction;

public abstract class Phone { //클래스 앞에 abstract 키워드를 붙이면 추상 클래스가 된다. 이 자체로는 객체생성이 불가능하다.
	public String owner;

	public Phone() {}
	
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	//메소드
	public void turnOn(String owner) {
		System.out.println(owner+"(이)가 "
				+ "전원을 켭니다.");
	}
	public void turnOff(String owner) {
		System.out.println(owner+"(이)가 "
				+ "전원을 끕니다.");
	}
}
