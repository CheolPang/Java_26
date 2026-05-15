package extend.poly;

public class ScoreP {
	String name;
	int kor, eng, math, total;
	double avg;
	
	public ScoreP() {}

	public ScoreP(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		total = kor+eng+math;
		return total;
	}

	public double getAvg() {
		avg = (double) total/3;
		return avg;
	}
	
	public void output() {
		System.out.printf("이름 %s, 총점: %d, 평균: %.1f\n", name, getTotal(), getAvg());
	}
	
	
	
	
}
