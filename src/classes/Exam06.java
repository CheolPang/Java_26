package classes;

class Person{
	static int count = 10; // static 변수는 메모리의 method 영역에 저장되어 언제든지 접근가능
	static String name = "초기값 이름";
	
	Person(){
		System.out.println(count);
		count++;
		System.out.println(count);
		name = "이병수";
		System.out.println("================");
	}
	static void printCount( ) {
		System.out.println("count : "+ count);
		System.out.println("name : "+name);
	}
}
public class Exam06 {  

	public static void main(String[] args) {
		System.out.println(Person.count);
		Person.printCount();
	}

}
