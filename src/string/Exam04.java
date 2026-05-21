package string;

public class Exam04 {
	public static void main(String[] args) {
		//String 클래스의 자주 사용하는 메소드들
		String s1 = "자바 Programming";
		String s2 = new String("JAVA");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println("========위치 찾기=======");
		System.out.println(s1.indexOf(" "));
		System.out.println(s1.lastIndexOf(" "));
		System.out.println(s1.indexOf("m"));
		System.out.println(s1.lastIndexOf("m"));
		System.out.println(s2.lastIndexOf("a"));
		
		System.out.println("=======문자열 변경=======");
		String new_s1 = s1.replace(" ", "_");
		System.out.println(new_s1);
		
		String new_s2 = s2.replace("A", "a");
		System.out.println(new_s2);
		
		System.out.println("=======대소문자로 변경====");
		String upper = new_s2.toUpperCase();
		String lower = new_s2.toLowerCase(); 
		System.out.println(upper);
		System.out.println(lower);
		
		System.out.println("=======앞 뒤 공백 제거====");
		String s3 = "			enjoy coding	";
		String r3 = s3.trim();
		System.out.println(s3+"====");
		System.out.println(r3+"====");
		String r4 = s3.replace(" ", "");
		System.out.println(r4 + "====");
		
		System.out.println("=======문자열 자르기===========");
		String sub1 = s1.substring(0, 4);
		System.out.println(sub1);
		String sub2 = s1.substring(2);
		System.out.println(sub2);
		
		System.out.println("=======서식지정 문자열=========");
		String s4 = String.format("%d년 %02d월 %02d일 %s %.2f %c", 2026, 5, 20, "수요일", 0.2, '수');
		System.out.println(s4);
		
		System.out.println("=======특정 문자 기준으로 분리===");
		String src = "C++/Java/Javascript/Python";
		String[] data = src.split("/");
		System.out.println(data[0]);
		for(int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
