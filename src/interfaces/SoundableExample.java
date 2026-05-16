package interfaces;

public class SoundableExample {
	//인터페이스가 메소드의 매개변수 타입으로 사용될 수 있다!!
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	};
	
	public static void main(String[] args) {
		
		
		/*Cat cat = new Cat();
		cat.sound();

		Dog dog = new Dog();
		dog.sound();*/
		printSound(new Cat());
		printSound(new Dog());
	}
}
