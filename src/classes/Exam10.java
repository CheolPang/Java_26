package classes;

public class Exam10 {
	public static void main(String[] args) {
		ShopService object1 = ShopService.getInstance();
		System.out.println(object1);
		ShopService object2 = ShopService.getInstance();
		System.out.println(object2);
		System.out.println(object1.toString());
		System.out.println(object2.toString());
		if (object1.toString().equals(object2.toString())) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}

	}
}
