package thread;

class Account {
	int balance = 100000;

	public synchronized void withDraw(int money) {
		if (balance >= money) {
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName() + " 출금금액->>" + money);
			try {
				Thread.sleep(1000);
				balance -= money;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Task implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while (acc.balance > 0) {
			Thread thread = Thread.currentThread();
			int money = (int) (Math.random() * 3 + 1) * 1000;
			acc.withDraw(money);
			System.out.println(thread.getName() + " 잔액->>" + acc.balance);
		}
	}
}

public class Exam04 {
	public static void main(String[] args) {
		//Race Condition: 여러 스레드가 동시에 실행되면서 공유자원에 접근하고 수정할 때 예상치 못한 결과가 발생하는 상황
		//동기화(synchronized) :Race Condition 을 방지하기 위해 한 스레드가 사용중인 객체를 다른 스레드 동시에 접근할 수 없도록 잠금을 걸어주는 기능
		/* 
		 public synchronized void method() {
		 	...임계 영역
		 }
		 public void method() {
		 	//여러 스레드가 실행 가능한 영역
		 	synchronized(){
		 		...임계 영역
		 	}
		 }
		 */
		Task task = new Task();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.setName("스레드1");
		t2.setName("스레드2");
		
		t1.start();
		t2.start();
	}	
}
