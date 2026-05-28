package lambda;

@FunctionalInterface
interface Test {
	int getSum(int n);
}

public class Exam04 {
	public static void main(String[] args) {
		Test t = (n)-> {
			int result =0;
			for (int i = 0; i<=n; i++) result += i;
			return result;
		};
		System.out.println("1~10의 총합은 "+t.getSum(10));
		System.out.println("1~10의 총합은 "+t.getSum(20));
	}
}
