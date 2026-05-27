package collection.lifofifo;

import java.util.LinkedList;
import java.util.Queue;

public class Exam02 {
	public static void main(String[] args) {
		//FIFO:First Input First Out
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(5);
		q.add(80);
		System.out.println(q);
		
		int data = q.poll();
		System.out.println(data);
		System.out.println(q);
		int data2 = q.peek();
		System.out.println(data2);
		System.out.println(q);
		
		q.offer(40);
		System.out.println(q);
		
		System.out.println("=============");
		Queue<Message> m = new LinkedList<Message>();
		m.add(new Message("sendMail", "남현우"));
		m.add(new Message("sendSMS", "이승언"));
		m.add(new Message("sendTalk", "김선배"));
		
		while(!m.isEmpty()) {
			Message ms = m.poll();
			switch (ms.action) {
				case "sendMail": {
					System.out.println(ms.to+"님에게 메일을 보냅니다.");
					break;
				}
				case "sendSMS": {
					System.out.println(ms.to+"님에게 문자를 보냅니다.");
					break;
				}
				case "sendTalk": {
					System.out.println(ms.to+"님에게 카카오톡을 보냅니다.");
					break;
				}
			}
			System.out.println("남아있는 데이터: "+m);
		}
	}
}
