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
}
