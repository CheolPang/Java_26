package stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exam04_buffer {
	public static void main(String[] args) throws IOException {
		// 보조스트림은 다른 스트림과 연결되어 여러가지 편리한 기능을 제공하는 스트림으로 사용방법은 보조스트림 변수명 = new
		// 보조스트림(연결스트림);
		long start = 0;
		long end = 0;

		FileInputStream fis1 = new FileInputStream("img/img.jpg");
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {
		}
		end = System.currentTimeMillis();
		System.out.println("==보조 스트림을 사용하지 않았을 때: " + (end - start) + "ms");
		fis1.close();

		// 보조스트림 사용
		FileInputStream fis2 = new FileInputStream("img/img.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {
		}
		end = System.currentTimeMillis();
		System.out.println("==보조 스트림을 사용했을 때: " + (end - start) + "ms");
		bis.close();
		fis2.close();
	}
}
