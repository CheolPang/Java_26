package generic;

import java.util.Arrays;

class Person {
} // 사람

class Worker extends Person {
} // 직장인

class Student extends Person {
} // 학생

class HighStudent extends Person {
} // 고등학생

public class Exam05 {
	// 모든 수강생이 들을 수 있는 괴정 등록
	public static void registerCource(Course<?> course) {
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}

	// 학생만 들을 수 있는 과정 등록
	public static void registerCourceStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}

	// 직장인과 일반인이 들을 수 있는 과정 등록
	public static void Worker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personC = new Course<Person>("일반인 과정", 10);
		personC.add("김일반");
		personC.add("김직장");
		personC.add("김힉생");
		personC.add("김고등");

		Course<Worker> workerC = new Course<Worker>("직장인 과정", 5);
		workerC.add("이직장");
		workerC.add("김직장");
		workerC.add("박직장");

		Course<Student> studentC = new Course<Student>("학생 과정", 5);
		studentC.add("김학생");
		studentC.add("박학생");
		studentC.add("신학생");

		Course<HighStudent> highC = new Course<HighStudent>("고등학교 과정", 5);
		highC.add("김고등");
		highC.add("박고등");
		highC.add("신고등");

		registerCource(personC);
		registerCource(workerC);
		registerCource(studentC);
		registerCource(highC);
		System.out.println("================");
		//registerCourceStudent(personC);
		//registerCourceStudent(workerC);
		//registerCourceStudent(studentC);
		//registerCourceStudent(highC);
		System.out.println("================");
		//registerCourceWorker(personC);
//		registerCourceWorker(workerC);
//		registerCourceWorker(studentC);
//		registerCourceWorker(highC);
		
		
		
	}
}