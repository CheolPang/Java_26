package extend.army;

public class Army16 extends Unit14 {
	
	public Army16(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println(getName() + " >> 공격 준비");
		System.out.println(getName() + " >> 지상 공격 실행함");
	}
	
	public void tank() {
		System.out.println(getName() + " >> 탱크 공격");
	}




	

	
}
