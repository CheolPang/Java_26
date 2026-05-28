package enums;

enum Cards {
	HEART, CLUB, SPADE, DIAMOND
}

public class Exam01 {
	public static void main(String[] args) {
		Cards cards;
		Cards all [] = Cards.values();
		System.out.println(all);
		for(Cards card:all) {
			System.out.println(card);
		}
		
		System.out.println("==========");
		cards = Cards.valueOf("CLUB");
		System.out.println(cards);
		
		int num = Cards.SPADE.ordinal();
		System.out.println(num);
	
	}
}
