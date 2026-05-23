package otherClass;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		//박싱 - 명시적인 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		//언박싱
		int val1 = obj1.intValue();
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();
		
		System.out.println(val1+1);
		System.out.println(val2+1);
		System.out.println(val3+1);

		
		System.out.println(obj1 == val1);
		System.out.println(obj2 == val2);
		System.out.println(obj3 == val3);
		
		Integer object1 = 300; //자동박싱 => 묵시적인 박싱
		Integer object2 = 300; //자동박싱
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object1==object2); //포장 객체의 참조 주소값을 비교하기 떄문에 
		
		int value1 = object1;
		int value2 = object2;
		System.out.println(value1+value2);
		
		//문자열을 매개값으로 받아 기본 타입 값으로 변경
		String str1 = "20";
		System.out.println(str1+1); //당연히 문자열에 더했으니까 201이 되버림
		int num1 = Integer.parseInt(str1); //문자열을 정수로 바꿔버리는 거
		System.out.println(num1+1); //근데 얘는 정수로 바뀌어버려서 21이 됨
		double num2 = Double.parseDouble(str1); //문자열을 실수로 바꿔버리는 거
		System.out.println(num2+1); //얘도 똑같음. (21.0)
		
		
		
	}
	
}


