package string;

public class Exam06_SelfEx {
	public static void main(String[] args) {
		String Number = "9005011234567";
		
		
		String year = Number.substring(0, 2);
		
		String month = Number.substring(2, 4);
		
		String date = Number.substring(4, 6);
		
		String SeongInput = Number.substring(6, 7);
		
		
		if (SeongInput.equals("1")) {
			System.out.println(String.format("19%s년 %s월 %s일 %s", year, month, date, "남자"));
		} else if (SeongInput.equals("2")) {
			System.out.println(String.format("19%s년 %s월 %s일 %s", year, month, date, "여자"));
		}
		
		
	
		
	}
}
