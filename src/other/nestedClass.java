package other;

class A {
	// 중첩 클래스, 내부 클래스란 클래스 내부에 선언한 클래스
	// 1)멤버 클래스: 클래스 내부에 클래스의 멤버로써 선언되는 중첩 클래스=>
	// static 키워드가 안붙는 인스턴스 멤버 클래스와 static 키워드가 붙는 정적 멤버 클래스가 있다.
	// 1)-(1)인스턴스 멤버 클래스
	class B {
		int field1;

		void method1() {
			System.out.println("인스턴스 멤버 클래스로 A객체를 생성해야만 사용할 수 있는 B클래스");
		}
	}

	B field = new B();

	// 1)-(2)정적 멤버 클래스
	static class C {
		int field2;

		void method2() {
			System.out.println("A클래스로 바로 접근할 수 있는 인스턴스 메소드");
		}

		static void method3() {
			System.out.println("A클래스로 바로 접근할 수 있는 정적 메소드");
		}
	}
	A() {
		class D{
			int field1;
			void method1() {
				System.out.println("A클래스의 생성자 함수가 호출되면서 실행이 가능한 로컬 메소드");
			}
		}
		D d = new D();
		d.field1 = 50;
		d.method1();
	}
	void method() {
		class E {
			E() {
				System.out.println("E객체가 생성됨");
			}
		}
		E e = new E();
	}
}

public class nestedClass {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.field);
		A.B b = a.new B();
		b.method1();
		System.out.println("================");
		A.C c = new A.C();
		c.field2=10;
		c.method2();
		a.method();
	}

}
