package stream;

import java.io.File;
import java.io.IOException;

public class Exam06_FileClass {
	public static void main(String[] args) {
		File file = new File("src/test/Test.java");
		System.out.println(file);
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
		System.out.println(file.exists());
		file.delete();
		System.out.println(file.exists());
		try {
			file.createNewFile();
			System.out.println("파일생성완료");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일생성에러");
		} finally {
			System.out.println(file.exists());
		}
		File folder = new File("a/b/c/target");
		folder.mkdirs();
		System.out.println(folder.isDirectory());
		System.out.println(folder.getName());
		System.out.println(folder.getParent());
		if(folder.delete()) System.out.println("폴더삭제성공");
		System.out.println(folder);
		System.out.println(folder.getAbsolutePath());
	}
}
