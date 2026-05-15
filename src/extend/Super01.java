package extend;

class Parent{
	protected int dataA;
	Parent(){System.out.println("매개변수 없는 Parent 생성자 호출");}
	//1)
	Parent(int dataA){
		System.out.println("Parent 생성자 호출");
		this.dataA = dataA;
	}
	//2)
	void printA() {
		System.out.println("dataA: "+dataA);
	}
}

class Child extends Parent {
	private int dataB;
	Child(){
		System.out.println("매개변수 없는 Child 생성자 호출");
	}
	//3)
	Child(int dataA, int dataB) {
		//super(dataA);
		//super();
		System.out.println("Child 생성자 호출");
		this.dataB = dataB;
		
	}
	//4)
	void PrintB() {
		System.out.println("dataA: "+dataA+" dataB: "+dataB);
	}
}

public class Super01 {
	public static void main(String[] args) {
		Child c = new Child(3, 6);
		c.PrintB();
		c.printA();
		//실행되는 순서는? 1->3->2->4
		System.out.println("==========");
		Child c2 = new Child();
		
	}
}
