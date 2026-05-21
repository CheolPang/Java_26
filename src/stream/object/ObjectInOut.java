package stream.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInOut {
	// 객체를 파일로 저장하는 메소드
	public boolean write(String fileName, List<StudentVO> list) throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		boolean result = false;

		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);

			oos.writeInt(list.size());
			for (int i = 0; i < list.size(); i++) {
				StudentVO std = list.get(i);
				oos.writeObject(std);
			}
			result = true; // 파일저장성공
			System.out.println("[INFO] 파일 저장이 성공하였습니다. >> " + fileName);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("[ERROR:01] 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[ERROR:02] IO 예외가 발생하였습니다.");
		} catch (Exception e) {
			System.out.println("[ERROR:03] 알 수 없는 예외가 발생하였습니다.");
		} finally {
			oos.close();
			fos.flush();
			fos.close();
		}
		return result;

	}

	// 2)파일에서 객체를 읽어오는 메소드
	public List<StudentVO> read(String fileName) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<StudentVO> list = new ArrayList<StudentVO>();

		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);

			int num = ois.readInt();
			for (int i = 0; i < num; i++) {
				StudentVO vo = (StudentVO) ois.readObject();
				list.add(vo);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("[ERROR:01] 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[ERROR:02] IO 예외가 발생하였습니다.");
		} catch (Exception e) {
			System.out.println("[ERROR:03] 알 수 없는 예외가 발생하였습니다.");
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("[ERROR:02] IO 예외가 발생하였습니다.");
			}
		}
		return list;
	}
}