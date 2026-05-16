package exception;

public class Arrays {
	public static void main(String[] args) {
		int[] arr = new int[3];
		String data1 = null;
		String data2 = null;
		
		
		try {
			Class.forName("java.lang.String");
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(result);
			
			for(int i=0; i<4; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 벗어난 에러");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch(Exception e) {
			System.out.println("알 수 없는 에러가 발생하였습니다.");
		} finally {
			System.out.println("무조건 실행되는 코드");
		}
		System.out.println("프로그램 종료");
	}
	
}
