package map;

import java.util.Map;
import java.util.TreeMap;

public class Exam02 {
	public static void main(String[] args) {
		// TreeMap
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(80, "아이유");
		scores.put(90, "남현우");
		scores.put(95, "이승언");
		scores.put(70, "허준");
		scores.put(70, "허풍");
		System.out.println(scores);

		Map.Entry<Integer, String> entry = null;
		System.out.println("===키를 기준으로 가장 아래의 Map.Entry를 리턴===");
		entry = scores.firstEntry();
		System.out.println(entry);
		System.out.println("===키를 기준으로 가장 위의 Map.Entry를 리턴===");
		entry = scores.lastEntry();
		System.out.println(entry);
		System.out.println("===키를 기준으로 바로 아래의 Map.Entry를 리턴===");
		entry = scores.lowerEntry(90);
		System.out.println(entry);
		System.out.println("===키를 기준으로 바로 위의 Map.Entry를 리턴===");
		entry = scores.higherEntry(80);
		System.out.println(entry);
		System.out.println("===주어진 키와 동등한 키가 있으면 해당 키를 리턴하고 없으면 바로 아래의 Map.Entry를 리턴===");
		entry = scores.floorEntry(80);
		System.out.println(entry);
		System.out.println("===주어진 키와 동등한 키가 있으면 해당 키를 리턴하고 없으면 바로 위의 Map.Entry를 리턴===");
		entry = scores.ceilingEntry(81);
		System.out.println(entry);

	}
}
