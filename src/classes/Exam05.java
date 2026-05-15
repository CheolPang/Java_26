package classes;
import java.util.Scanner;

class Score{
	//학번, 이름, 국영수, 총점, 평균 필드 선언
	int num; // 학번은 연산할 일이 없기 때문에 int 대신 str 쓰는게 좋음
	String name;
	double kor;
	double eng;
	double math;
	double sum;
	double avg;
	//setter 학번, 이름, 국영수를 입력받아서 초기화
	
	void scoreSetter(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번을 입력해주세요: ");
		num = sc.nextInt();
		
		System.out.println("이름을 입력해주세요: ");
		name = sc.next();
		
		System.out.println("국어 점수를 입력해주세요: ");
		kor = sc.nextDouble();
		
		System.out.println("영어 점수를 입력해주세요: ");
		eng = sc.nextDouble();
		
		System.out.println("수학 점수를 입력해주세요: ");
		math = sc.nextDouble();
		
		sum = kor + eng + math;
		avg = sum / 3;
		
	}
	
	
	
	
	void hello() {
		System.out.println("성적을 확인해 주세요.");

	}
	
	void print() {
		// hello()를 호출
		hello(); // this.hello(); 처럼 this를 사용하여 호출하는것이 더 좋음.
		//..님의 성적 .. 학번, 이름, 국영수, 총점, 평균 모두 출력
		System.out.println(num + " " + name + "님의 성적은 다음과 같습니다");
		System.out.println("국어: " + kor + "점");
		System.out.println("영어: " + eng + "점");
		System.out.println("수학: " + math + "점");
		System.out.println("총점: " + sum + "점");
		System.out.println("평균: " + avg + "점");
	}
}

public class Exam05 {
	public static void main(String[] args) {
		Score s1 = new Score();
		s1.scoreSetter();
		s1.print();
	}

}
