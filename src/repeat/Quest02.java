package repeat;

public class Quest02 {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) { // i는 줄을 의미
			for(int j=1; j<=5-i; j++) { // 별을 가운데에 두기 위해 공백 출력
				System.out.print(" ");
			}
			for(int j=1; j<(2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
