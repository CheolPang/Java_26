package generic;

public class Exam03 {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		
		boolean result1 = p1 == p2;
		System.out.println(result1); // 다른 주소값을 참조하기 때문에 false가 출력됨.
		System.out.println(p1.equals(p2));
		
		
	}
}
