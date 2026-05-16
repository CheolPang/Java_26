package interfaces;

class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	void run() {

		for (int i = 0; i < 2; i++) {

			if (i == 0) {
				Tire frontLeftTire = new KumhoTire();
				Tire frontRightTire = new KumhoTire();
				Tire backLeftTire = new KumhoTire();
				Tire backRightTire = new KumhoTire();

				frontLeftTire.roll();
				frontRightTire.roll();
				backLeftTire.roll();
				backRightTire.roll();
			} else {
				frontLeftTire.roll();
				frontRightTire.roll();
				backLeftTire.roll();
				backRightTire.roll();
			}

		}

	}

}

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
	}
}
