package dbtest.self;

public class UserDTO {
	private String ID;
	private String PW;
	private String NM;
	private int WARN;
	private int BAN;
	private String DATE;

	public UserDTO() {
	}

	public UserDTO(String iD, String pW, String nM, int wARN, int bAN, String dATE) {
		super();
		ID = iD;
		PW = pW;
		NM = nM;
		WARN = wARN;
		BAN = bAN;
		DATE = dATE;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public String getNM() {
		return NM;
	}

	public void setNM(String nM) {
		NM = nM;
	}

	public int getWARN() {
		return WARN;
	}

	public void setWARN(int wARN) {
		WARN = wARN;
	}

	public int getBAN() {
		return BAN;
	}

	public void setBAN(int bAN) {
		BAN = bAN;
	}

	public String getDATE() {
		return DATE;
	}

	public void setDATE(String dATE) {
		DATE = dATE;
	}

	@Override
	public String toString() {
		String banStatus;
		if (BAN == 1) {
			banStatus = "영구 차단됨";
		} else {
			banStatus = "영구 차단되지 않음";
		}
		return "[유저 정보] 아이디: " + ID + ", 비밀번호: " + PW + ", 닉네임: " + NM + ", 누적 경고: " + WARN + ", 영구 차단 여부: " + banStatus
				+ ", 계정 생성 날짜: " + DATE + "]";
	}
}