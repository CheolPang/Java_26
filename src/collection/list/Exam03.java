package collection.list;

import java.util.Arrays;
import java.util.List;

public class Exam03 {
	public static void main(String[] args) {
		List<String> sList = Arrays.asList("강동원", "성시경", "이정재", "정우성");
		for(String name : sList) System.out.println(name);
	}
}
