package method;

public class Exam01 {
	//메소드의 시그니처:(접근제어자) (static의 유무) 리턴타입 메소드(){}
	
	//1)매개변수와 반환값이 모두 없는 메소드
	public static void show() {
		System.out.println("나는 show 메소드이다.");
	}
	//2)매개변수는 있고 반환값은 없는 메소드
	public static void findPower(int x, int y) {
		int result = 1;
		for(int a=1; a<=y; a++) {
			result *= x;
		}
		System.out.println(x+"의 "+y+"제곱은 "+result);
	}
	
	//3)매개변수는 없고 반환값은 있는 메소드
	public static int doSomething() {
		int result;
		result = 10*100;
		return result;
	}
	//4)매개변수와 반환값이 모두 있는 메소드
	public static int add(int x, int y) {
		int result = x+y;
		return result;
	}
	
	
	
	public static void main(String[] args) {
		show();
		findPower(98224, 4);
		int num = doSomething();
		System.out.println(num);
		int result = add(10, 5);
		System.out.println(result);
	}

}
