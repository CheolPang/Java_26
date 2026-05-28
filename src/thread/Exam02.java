package thread;

import java.awt.Toolkit;

class BeepTask implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Exam02 {
	public static void main(String[] args) {
		Runnable task = new BeepTask();
		Thread thread = new Thread(task); // 작업 스레드가 생성
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("삐~!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
