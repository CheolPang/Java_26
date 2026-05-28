package lambda;

@FunctionalInterface
interface Testing {
	boolean testing(int n, int m);
}

public class Exam03 {
	public static void main(String[] args) {
		Testing t1 = (n , d)->(n%4)==0;
		if (t1.testing(10,5)) {
			System.out.println("5는 10의 약수이다");
		}
		if (t1.testing(10,3)) {
			System.out.println("20은 10의 약수이다");
		}
		if (t1.testing(10,5)) {
			System.out.println("30은 10의 약수이다");
		}
		Testing t2 = (n, m) -> (n<m);
	}
}
