package abstraction;

public class Exam01 {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone(); 
		smartPhone.turnOn("김민경");
		smartPhone.internetSearch();
		smartPhone.turnOff("김민경");
		
		Tablet tablet = new Tablet();
		tablet.turnOn("이시우");
		tablet.watchTV();
		tablet.turnOff("이시우");
	}
}
