package extend.army;

public class Unit14 {
	private String name;
	
	public Unit14(String name) {
		this.name = name;
	}
	
	public void attack() {
		System.out.println(name + " >> 공격 준비");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
