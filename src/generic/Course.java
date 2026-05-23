package generic;

//와일드카드 타입 활용하기
//1)제네릭타입<?> => 제한없음
//2)제네릭타입<? extends 상위타입>:상위 클래스 제한
//3)제네릭타입<? super 하위타입>:하위 클래스 제한

public class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		super();
		this.name = name;
		this.students = (T[]) new Object[capacity]; // new T[n] X
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(String name) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = (T) name;
				break;
				
			}
		}
	}

}
