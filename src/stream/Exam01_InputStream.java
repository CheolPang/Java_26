package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam01_InputStream {
	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("img/img.jpg")) {
			int data;
			long byteCount = 0;
			while ((data = is.read()) != -1) {
				if (byteCount < 10) {
					System.out.printf("Byte %d: 0x%02X\n", byteCount, data);
				}
				byteCount++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. 경로를 확인해 주세요.");
			e.printStackTrace();
		} catch (IOException e) { 
			System.out.println("파일을 읽는 중 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
