package extend;

public class CalcParent {
	CalcParent() {
		System.out.println("부모 생성자 호출");
	}
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x-y;
	}
}
