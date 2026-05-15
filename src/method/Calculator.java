package method;

public class Calculator {
	//사각형의 넓이를 구하는 클래스
	//1)areaRectangle : 정사각형의 넓이를 구하는 함수
	//2)areaRectangle : 직사각형의 넓이를 구하는 함수
	public static int areaRectangle(int width, int height) {
		return width * height;
	}
	public static int areaRectangle(double width, int height) {
		return (int) (width * height);
	}
}
