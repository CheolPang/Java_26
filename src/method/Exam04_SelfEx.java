package method;

public class Exam04_SelfEx {
	public static void main(String[] args) {
		//Calculator 객체를 생성해서 출력구문으로 정사각형의 넓이(10X10)와 직사각형의 넓이(10X20)를 출력하기
		Calculator calc = new Calculator();
		
		
		System.out.println("정사각형 넓이: "+calc.areaRectangle(10, 10));
		System.out.println("직사각형 넓이: "+calc.areaRectangle(10, 20));
	}

}
