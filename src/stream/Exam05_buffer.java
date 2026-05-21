package stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam05_buffer {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/test.txt")));

//		FileInputStream fis = new FileInputStream("src/test.txt");

		int x = 0;
		while ((x = reader.read()) != -1)
			System.out.print((char) x);
		reader.close();
	}
}
