package extend.poly;

public class ScoreC extends ScoreP {
	//🌟🌟🌟🌟🌟다형성🌟🌟🌟🌟🌟
	int music, computer;

	public ScoreC(String name, int kor, int eng, int math, int music, int computer) {
		super(name, kor, eng, math);
		this.music = music;
		this.computer = computer;
	}
	
	@Override //기능을 다르게 해서 쓰려고 덮어씌우는걸 오버라이드라고 한다.
	public int getTotal() {
		total = kor+eng+math+music+computer;
		return total;
	}
	
	@Override
	public double getAvg() {
		avg = (double) total/5;
		return avg;
	}
}
