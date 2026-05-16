package interfaces;

public class MyClassExam {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		m1.rc.turnOn();
		
		@SuppressWarnings("unused")
		MyClass m2 = new MyClass(new Audio());
		
		System.out.println("===================");
		MyClass m3 = new MyClass();
		m3.play();
		
		System.out.println("===================");
		MyClass m4 = new MyClass();
		m4.play(new Televison());
		
		
	}
}
