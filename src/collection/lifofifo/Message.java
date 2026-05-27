package collection.lifofifo;

public class Message {
	public String action;
	public String to;

	public Message(String action, String to) {
		super();
		this.action = action;
		this.to = to;
	}
}
