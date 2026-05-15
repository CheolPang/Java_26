package test;

public class Test {
	public static void main(String[] args) {
		String name = "이효리";
		System.out.println("name = "+name);
		
		String department = "개발부";
		System.out.println("department: "+department);
		
		String Jikwi = "대리";
		System.out.println("직위: "+Jikwi);
		
		int gup = 1500000;
		System.out.printf("급여: %d원\n", gup);
		System.out.printf("나는 %s\n", name+" "+Jikwi+"의 " + "\"성격\"" + "이 좋습니다.");
	}
}