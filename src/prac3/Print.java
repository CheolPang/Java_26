package prac3;

public class Print extends Sales {

	public void printSale() {

		double original = getQty() * getCost();

		double discountPrice = original - (original * Sales.getDiscount());

		System.out.println(getArticle() + "   " + discountPrice + "원");
	}
}