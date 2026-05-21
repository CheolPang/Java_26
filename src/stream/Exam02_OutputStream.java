package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam02_OutputStream {
	public static void main(String[] args) throws IOException {
		try {
			OutputStream os = new FileOutputStream("C:\\Users\\Administrator\\test.txt");
			byte[] data = "오늘은 목요일".getBytes();
			for(int i = 0; i<data.length; i++) {
				os.write(data[i]);
			}
			System.out.println("===파일이 저장되었습니다===");
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일생성에러발생");
		}
	}
}
