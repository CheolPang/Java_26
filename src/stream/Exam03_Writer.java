package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam03_Writer {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("src/test.txt");
		char[] data = "자바 코딩 너무 재미있다.".toCharArray();
		writer.write(data, 3, 2);
		System.out.println("파일 생성해서 데이터 입력완료");
		writer.flush();
		writer.close();
	}
}
