package extend.calc;

public class Prac {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();

		r.setBase(10.5);
		r.setHeight(20.5);
		System.out.println("사각형의 넓이: " + r.Rectangle());

		t.setBase(5);
		t.setHeight(9);
		System.out.println("삼각형의 넓이: " + t.Triangle());

	}

}
