package extend;

public class CalcExample {
	public static void main(String[] args) {
		CalcParent parent = new CalcParent();
		int result;
		result = parent.plus(5, 10);
		System.out.println(result);
		
		System.out.println("===============");
		CalcChild child = new CalcChild();
		int result2;
		result2 = child.multiply(5, 10);
		System.out.println(result2);
		System.out.println(child.minus(5, 10));
	}
}
