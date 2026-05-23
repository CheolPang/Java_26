package generic;

public class Exam02 {
	public static void main(String[] args) {
		Present<Integer> p1 = Util.presenting(100);
		int intValue = p1.getT();
		System.out.println(100 + 1);
		System.out.println(intValue);
		Present<String> p2 = Util.presenting("전지현");
		String strValue = p2.getT();
		System.out.println(strValue);
	}
}
