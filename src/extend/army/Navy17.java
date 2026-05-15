package extend.army;

public class Navy17 extends Unit14 {
	
	public Navy17(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println(getName() + " >> 공격 준비");
		System.out.println(getName() + " >> 어뢰 발사!!");
	}
	
	public void nucleus() {
		System.out.println(getName() + " >> 지상 상륙");
		System.out.println(getName() + " >> 핵미사일");
	}
}
