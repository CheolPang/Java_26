package method;

public class Exam02 {
	//매개변수의 개수를 알 수 없는 경우
	//1)매개변수를 배열 타입으로 선언
	static int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//2)매개변수를 ...을 이용하면 값의 목록만 넘겨줄 수 있다.
	static int sum2(int...values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] values = {1,2,3,4};
		int result = sum1(values);
		System.out.println(result);
		
		int result2 = sum2(2,3);
		System.out.println(result2);
	}

}
