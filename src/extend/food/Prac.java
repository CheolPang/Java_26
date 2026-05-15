package extend.food;

public class Prac {
	public static void main(String[] args) {
		System.out.println("=============");
		Parent p = new Parent();
		p.eat();
		p.pay();
		System.out.println("=============");
		Child c = new Child();
		c.eat();
		c.newSkill();
		c.pay();
		System.out.println("=============");
		Parent x = new Child();
		c.eat();
		c.drink();
		c.pay();
		
		//부모변수명 instanceof 자식 생성자명=>부모타입이 자식의 인스턴스 타입이다.
		if(x instanceof Child) {
			boolean bool = x instanceof Child;
			System.out.println(bool);
		} else {
			boolean bool = x instanceof Child;
			System.out.println(bool);
		}
		if(x instanceof Child) {
			((Child)x).newSkill();
		}
		((Child)x).newSkill();
	}
}
