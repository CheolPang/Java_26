package classes;

class Car {
	String kind; // 차종
	String color; // 색
	int year; // 연식

	void run() { // 출력구문
		System.out.println(kind + " 자동차가 질주한다.");
	}

	void speedUp() { // 출력구문
		System.out.println(color + "의 " + year + "년식 " + kind + " 자동차가 스피드를 올리고 있다.");
	}
}

public class Exam03 {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.kind = "BMW";
		myCar.color = "흰색";
		myCar.year = 2027;
		myCar.run();
		myCar.speedUp();
		System.out.println(myCar);

		Car yourCar = new Car();
		yourCar.kind = "KGM";
		yourCar.color = "검은색";
		yourCar.year = 2025;
		yourCar.run();
		yourCar.speedUp();
		System.out.println(yourCar);

		Car herCar = new Car();
		System.out.println(herCar);
		herCar = myCar;
		herCar.run();
		herCar.speedUp();
		System.out.println(herCar); //인스턴스 변수에 다른 인스턴스를 담으면 같은 주소값을 참조한다!
	}

}
