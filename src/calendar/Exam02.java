package calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

class MathClass {
	static int random(int min, int max) {
		int num = (int) (Math.random()*(max - min));
		return num;
	}
}

public class Exam02 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("G yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String str = sdf.format(now);
		System.out.println(str);
		
		
		
		
		
	}
}
