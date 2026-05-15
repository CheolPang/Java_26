package method;

public class Exam03 {
	// 🌟🌟100 메소드 오버로딩 🌟🌟
	public static int plus(int a, int b) {
		return a + b;
	}

	public static int plus(int a) {
		return a;
	}

	public static double plus(double a) {
		return a * 100;
	}

	public static double plus(double a, double b) {
		return a + b;
	}

	public static double plus(int a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(plus(5, 7));
		System.out.println(plus(5));
		System.out.println(plus(5.0));
		System.out.println(plus(5.0, 7.0));
		System.out.println(plus(5, 7.0));
	}
}
