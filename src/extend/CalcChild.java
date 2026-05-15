package extend;

public class CalcChild extends CalcParent {
	CalcChild() {
		System.out.println("자식 생성자 호출");
	}
	public int multiply(int x, int y) {
		return x*y;
	}
	public int divide(int x, int y) {
		return x/y;
	}
}
