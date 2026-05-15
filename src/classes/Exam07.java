package classes;

import com.usebook.Book;

public class Exam07 {
	public static void main(String[] args) {
		// 접근제한자에 따라 접근하기
		Book book = new Book();
		book.printBook();
		//Book book1 = new Book("자바 프로그래밍");는 private 접근제한자를 가지고 있는 생성자 함수이기 때문에 다른 클래스에서는 접근할 수 없고 본인 클래스에서만 접근 가능하다!!
		// Book book2 = new Book("자바 프로그래밍", 20000);
		// book2.printBook();
		//=>protected 접근 제한자를 가지고 있는 생성자 함수는 다른 패키지에서는 사용 불가. 단, 다른 패키지라 하더라도 부모를 상속받는 자식 클래스라면 접근 가능.
		// Book book3 = new Book("자바 프로그래밍", 20000, "김작가", "정보고출판사");
		//=>default 접근 제한자를 가지고 있는 생성자 함수는 다른 패키지에서는 사용 불가
	}
}
