package interfaces;

interface Things {
	// 인터페이스에 선언된 추상 메소드.
	void printInfo(); // 컴파일 과정에서 public abstract가 붙기 때문에 생략 가능하다.
}

class ChildrenBook implements Things { // 1) 클래스가 인터페이스를 상속받는 방법
	private String title;
	private String author;

	public ChildrenBook() {
		super();
	}

	public ChildrenBook(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	@Override
	public void printInfo() {
		System.out.println("==어린이책 정보==");
		 System.out.println(this.title + "의 저자 : " +this.author);
	}

}
interface Book extends Things{
	void showTitle();
}

class Books implements Book {

	@Override
	public void printInfo() {
		System.out.println("==책 정보==");
		
	}

	@Override
	public void showTitle() {
		System.out.println("==책 제목==");
		
	}
	
}
public class ThingsExample {
	public static void main(String[] args) {
		ChildrenBook childrenBook = new ChildrenBook("자바 어린이책", "김지은");
		childrenBook.printInfo();
		
		Books books = new Books();
		books.printInfo();
		books.showTitle();
	}
}
