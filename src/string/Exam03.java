package string;

import java.util.Date;

class Books {
	private String name;
	private int price;

	public Books() {
		super();
	}

	public Books(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

}

public class Exam03 {
	public static void main(String[] args) {
		Books b1 = new Books();
		Books b2 = new Books("자바책", 30000);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		String st = new String("자바책");
		System.out.println(st.toString());
		
		Date d = new Date();
		System.out.println(d.toString());
 	}
}
