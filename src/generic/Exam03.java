package generic;

public class Exam03 {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "사과"); //<> 안 값 생략이 가능함. (사실 <>도 생략은 가능한데 보통 <>까지는 씀)
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p3 = new Pair<Integer, String>(1, "바나나");
		
		boolean result1 = p1 == p2;
		System.out.println(result1); // 다른 주소값을 참조하기 때문에 false가 출력됨.
		System.out.println(p1.equals(p2));
		
		System.out.println("================");
		boolean result2 = Util.compare(p1, p2);
		System.out.println(result2);
		boolean result3 = Util.compare(p1, p3);
		System.out.println(result3);
	}
}
