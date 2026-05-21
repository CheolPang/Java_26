package string;

public class Exam05_SelfEx {
	 public static void main(String[] args) {
		String src = "D:/photo/2021/travel/food.jpg";
		String name = src.substring(21, 25);
		System.out.println("파일이름: "+name);
		String hwak = src.substring(26, 29);
		System.out.println("확장자: "+hwak);
		String folder = src.substring(0, 20);
		System.out.println("폴더이름: "+folder);
	}
}