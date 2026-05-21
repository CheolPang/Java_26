package calendar;

import java.util.Calendar;

public class Exam03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		long ms1 = c.getTimeInMillis();
		System.out.println("계산 시작 >> "+ms1);
		for(int i=0; i < 1000; i++) {
			for (int j=0; j<1000; j++) {
				int d = i+1;
				int e = i+1;
			}
		}
		
		c = Calendar.getInstance(); 
		long ms2 = c.getTimeInMillis();
		System.out.println("계산 끝 >> "+(ms2 - ms1)+"ms 지났음");
	}
}
