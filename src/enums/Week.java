package enums;

public enum Week {// Week가 열거형
	MONDAY("월요일", 8), TUESDAY("화요일", 8), WEDENSDAY("수요일", 8), THURSDAY("목요일", 8), FRIDAY("금요일", 8), SATURDAY("토요일", 4),
	SUNDAY("일요일", 0); // 열거형 상수

	private String day;
	private int hour;

	private Week(String day, int hour) {
		this.day = day;
		this.hour = hour;
	}
	
	public void lectureInfo() {
		System.out.println(day+"의 수업시간은 "+hour+"시간입니다.");
	}

	public String getDay() {
		return day;
	}
}
