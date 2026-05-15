package classes;
// 생성자 함수 constructor
class Friends {
	String name;
	int age;
	// 개발자가 임의로 생성자 함수를 만들지 않으면 자동으로 기본 생성자 함수가 생성되어서 호출된다!
	Friends(){
		System.out.println("친구 생성자 함수가 호출되었습니다.");
	}
}
class Company{
	String name;
	int duration;
	Company(){
		System.out.println("회사 생성자 함수가 호출되었습니다.");
	}
	Company(String name, int duration){
		System.out.println("매개변수 있는 회사 생성자 함수가 호출되었습니다.");
		this.name = name;
		this.duration = duration;
	}
	// 개발자가 임의로 생성자 함수를 만들면 자동으로 생성되었던 기본 생성자 함수는 자동생성되지 않는다!
	void printCompany() {
		System.out.println("나 "+name+"(은)는 이 회사에 다닌지 "+duration+"년째이다.");
	}
}
public class Exam04 {
	public static void main(String[] args) {
		Friends friends = new Friends();
		// 인스턴스가 생성되면서 생성자 함수가 호출됨
		Company company = new Company("이병수", 5);
		Company company2 = new Company();
		company2.name="남현우";
		company2.duration=10;
		
		company.printCompany();
		company2.printCompany();
	}

}
