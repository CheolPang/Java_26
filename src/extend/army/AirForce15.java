package extend.army;

public class AirForce15 extends Unit14 {
	
	public AirForce15(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println(getName() + " >> 공격 준비");
		System.out.println(getName() + " >> 이륙");
	}
	
	public void bombing() {
		System.out.println(getName() + " >> 공중공격 실행함");
		System.out.println(getName() + " >> 폭격");
	}
}
