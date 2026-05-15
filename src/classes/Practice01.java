package classes;

import java.util.Scanner;
class Triangle{
	int width;
	int height;
	
	Triangle(){}
	
	
	Triangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	void setTriangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	double getArea(){
		return ((int)(width * height)) / 2;
	}
	void setTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 삼각형의 넓이를 구합니다. ===");
		System.out.println("원하는 밑변의 길이를 입력해주세요.");
		int width = sc.nextInt();
		
		System.out.println("원하는 높이의 길이를 입력해주세요.");
		int height = sc.nextInt();
		
		System.out.println("=== 삼각형의 넓이: " + (double)(width * height / 2));
	}
	
}

public class Practice01 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setTriangle(5, 12);
		System.out.println("삼각형의 넓이 : "+t1.getArea());

		Triangle t2 = new Triangle(45, 7);
		System.out.println("삼각형의 넓이 : "+t2.getArea());
		t1.setTriangle();
	}

}
