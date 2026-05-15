package classes;

class Student{
	String name = "김학생";
	int age = 17;
	
}


public class Exam01 {
	public static void main(String[] args) {
		// 타입명 변수명 [객체명] = new 클래스명()[생성자함수];
		Student student = new Student();  //student 인스턴스 생성
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student);
		
		student.name = "김해피";
		student.age = 20;
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student);
		
	}

}
