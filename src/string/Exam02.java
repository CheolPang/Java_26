package string;

public class Exam02 {
	public static void main(String[] args) {
		String name1 = "BTS";
		String name2 = new String("BTS");
		if(name1==name2) System.out.println("다른 문자열 객체를 참조함");
		else System.out.println("다른 문자열 객체를 참조함");
		System.out.println("================");
		if(name1.equals(name2)) System.out.println("같은 문자열");
		else System.out.println("다른 문자열");
		
		Thing thing = new Thing();
		Thing thing2 = new Thing();
		
		if(thing.equals(thing2)) System.out.println("같은 객체");
		else System.out.println("다른 객체");
		
		
	}
	
	
}
