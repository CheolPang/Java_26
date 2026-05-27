package collection.custom;

import java.io.Serializable;

public class CustomVO implements Serializable{
	private String number;
	private String name;
	private String call;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNamel() {
		return name;
	}
	public void setNamel(String name) {
		this.name = name;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	@Override
	public String toString() {
		String str = String.format("%5s %5s %5s", number,name,call);
		return str;
	}
	
}
