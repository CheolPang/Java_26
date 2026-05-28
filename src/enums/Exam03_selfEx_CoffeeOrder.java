package enums;

enum CoffeeType {
	ESPRESSO("ESPRESSO", 5000), AMERICANO("AMERICANO", 3500), LATTE("LATTE", 4000), CAPPUCCINO("CAPPUCCINO", 5500);

	private String name;
	private int price;

	private CoffeeType(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

enum CoffeeSize {
	SMALL("SMALL", 0), MEDIUM("MEDIUM", 500), LARGE("LARGE", 1000);

	private String sizeName;
	private int addPrice;

	private CoffeeSize(String sizeName, int addPrice) {
		this.sizeName = sizeName;
		this.addPrice = addPrice;
	}

	public String getSizeName() {
		return sizeName;
	}

	public int getAddPrice() {
		return addPrice;
	}
}

class CoffeeOrder {
	private String type;
	private String size;
	private int pay;
	
	public void calc(CoffeeType coffeeType, CoffeeSize coffeeSize) {
		this.pay = coffeeType.getPrice() + coffeeSize.getAddPrice();
	}

	public CoffeeOrder(CoffeeType coffeeType, CoffeeSize coffeeSize) {
		this.type = coffeeType.getName();
		this.size = coffeeSize.getSizeName();
		calc(coffeeType, coffeeSize);
	}

	public void printOrder() {
		System.out.println("주문한 " + size + " 사이즈의 " + type + " 종류의 커피는 금액이 " + pay + "원입니다.");
	}
}

public class Exam03_selfEx_CoffeeOrder {
	public static void main(String[] args) {
		CoffeeOrder order1 = new CoffeeOrder(CoffeeType.ESPRESSO, CoffeeSize.SMALL);
		CoffeeOrder order2 = new CoffeeOrder(CoffeeType.LATTE, CoffeeSize.MEDIUM);
		CoffeeOrder order3 = new CoffeeOrder(CoffeeType.CAPPUCCINO, CoffeeSize.LARGE);

		order1.printOrder();
		order2.printOrder();
		order3.printOrder();
	}
}