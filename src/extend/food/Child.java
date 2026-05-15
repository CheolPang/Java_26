package extend.food;

public class Child extends Parent {
	// 메소드 오버라이드
	@Override
	void eat() {
		System.out.println("Child - 손님들이 child가 전수받은 음식을 먹습니다.");
	}

	void newSkill() {
		System.out.println("Child - Child는 newSkill을 이용하여 기존과는 다른 메뉴를 개발, 판매합니다.");
	}

	@Override
	void drink() {
		System.out.println("Parent - 손님들이 child가 전수받은 전통차를 마십니다.");
	}

}
