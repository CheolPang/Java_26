package classes;

class HelloWorld {
	String message;

	void setEng() {
		message = "Hello class!";
	}

	void setKor() {
		message = "클래스 안녕!";
	}

	void sayHello() {
		System.out.println(message);
	}
}

public class Exam02 {
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setEng(); //setter (설정하는놈)
		helloWorld.sayHello();
		helloWorld.setKor();
		helloWorld.sayHello();
	}
}
