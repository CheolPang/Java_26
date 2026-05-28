package enums;

public class Exam02 {
	public static void main(String[] args) {
		Week.MONDAY.lectureInfo();
		Week arrayWeek[] = Week.values();
		for(Week w:arrayWeek) System.out.println(w.ordinal()+1+"번째 요일은 "+w.getDay());
	}
}
