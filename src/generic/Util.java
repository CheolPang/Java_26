package generic;

public class Util {
	// 제네릭 메소드: 매개타입과 리턴 타입으로 타입 파라미터를 갖는 메소드
	public static <T> /* 타입파라미터 */ Present<T> /* 리턴타입 */ presenting(T t) {
		Present<T> present = new Present<T>();
		present.setT(t);
		return present;
	}
	public static <K,V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean ValueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && ValueCompare;
	}
	
	//제한된 T타입
	public static <T extends Number> int compare(T t1 , T t2) {
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
	
		System.out.println(v1);
		System.out.println(v2);
		
		return Double.compare(v1, v2); //첫번째 매개값이 작으면 -1, 같으면 0, 크면 1을 리턴
		
		
	}
}
