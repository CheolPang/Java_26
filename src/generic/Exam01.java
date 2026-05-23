package generic;

public class Exam01 {
	public static void main(String[] args) {
		Present<String> present1 = new Present<String>(); //String으로 쓸거야! 라고 지정함.
		present1.setT("김현아"); //String으로 쓸 수 있게 됨.
		String name = present1.getT(); // 오토언박싱이 된 것임.
		System.out.println("이 선물은 "+name+"의 것이다.");
		
		Present<Integer> present2 = new Present<Integer>(); //Integer로 쓸거야! 라고 지정함.
		present2.setT(5); //Integer로 쓸 수 있게 됨.
		int num = present2.getT(); // 오토언박싱이 된 것임.
		System.out.println("선물을 "+num+"개 받았다.");
	}
}
