package abstraction;

public class Exam02 {
	public static void main(String[] args) {
		//Parent parent = new Parent(); 추상클래스는 객체생성 불가
		Child child = new Child();
		child.call();
		child.Print();
		child.show();
	}
}
