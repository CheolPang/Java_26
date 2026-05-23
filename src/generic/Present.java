package generic;

public class Present<T> { // 오브젝트 타입을 T로 만들어버림 (대문자, 한글자로만 줘야 함, 인터페이스 만들 때도 이렇게 사용 가능)
	private T t; // T타입 선언

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

// 호환성이 좋아진다는 장점이 있음.
// 제네릭 안에는 WrapperClass가 들어가야 함. (Integer, String 등.)
// 제네릭을 쓰게 되면 이 코드 자체가 오토언박싱이 되게 됨. 즉, 나중에 Getter로 일반 변수에 그냥 담아버리면 오토언박싱이 되게 됨.
