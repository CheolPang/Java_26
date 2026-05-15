package prac3;

import java.util.Scanner;

public class Prac13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Print[] op = new Print[2];

		for (int i = 0; i < 2; i++) {

			op[i] = new Print();

			System.out.print("품목 : ");
			op[i].setArticle(sc.next());

			System.out.print("수량 : ");
			op[i].setQty(sc.nextInt());
			Sales.setCnt(Sales.getCnt() + op[i].getQty());

			System.out.print("단가 : ");
			op[i].setCost(sc.nextInt());

			System.out.println();

		}

		System.out.print("할인율 : ");
		Sales.setDiscount(sc.nextDouble());

		System.out.println();
		System.out.println("==[판매가]==");

		for (int i = 0; i < 2; i++) {
			op[i].printSale();
		}

		System.out.println();
		System.out.println("판매건수 : " + Sales.getCnt());
	}
}