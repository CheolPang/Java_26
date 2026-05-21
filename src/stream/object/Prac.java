package stream.object;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Prac {
	public static void main(String[] args) {
		List<StudentVO> list = new ArrayList<StudentVO>();

		StudentVO vo1 = new StudentVO("강동원", 40, "서울특별시 강남구");
		StudentVO vo2 = new StudentVO("유재석", 45, "서울특별시 압구정동");

		list.add(vo1);
		list.add(vo2);
		list.add(new StudentVO("김진아", 48, "서울특별시 대치동"));
		list.add(new StudentVO("김하늘", 48, "수원특례시 인계동"));

		ObjectInOut objectInOut = new ObjectInOut();
		try {
			objectInOut.write("student.txt", list);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[ERROR:X1] 파일을 저장하는 데 문제가 발생했습니다.");
		}
		
		list = objectInOut.read("student.txt");
		for(int i=0; i<list.size(); i++) {
			StudentVO vo = list.get(i);
			System.out.println(vo);
		}
	}
}
