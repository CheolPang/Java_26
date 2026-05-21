package stream.object;

import java.io.Serializable;

//직렬화 : 객체를 바이트로 변환 <-> 역직렬화
public class ClassA implements Serializable{
	int field1; // 직렬화가 가능한 필드
	ClassB field2 = new ClassB();
	static int field3; //직렬화가 불가능한 필드
	transient int field4; //직렬화가 불가능한 필드
	
}
