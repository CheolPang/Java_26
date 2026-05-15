package prac3;

public class Sales {

	private String article;
	private int qty;
	private int cost;

	private static int cnt;
	private static double discount;

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		Sales.cnt = cnt;
	}

	public static double getDiscount() {
		return discount;
	}

	public static void setDiscount(double discount) {
		Sales.discount = discount;
	}
}