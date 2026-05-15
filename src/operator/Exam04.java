package operator;

public class Exam04 {

	public static void main(String[] args) {
		// 형변환에는 자동 형변환과 강제 형변환이 있다.
		long l;
		int i = 1000;
		l = i*i; // 자동형변환이 일어난다.
		System.out.println(l);
		
		byte b1, b2;
		int i2 = 100, j = 300;
		b1 = (byte) i2;
		System.out.println(b1);
		b2 = (byte) j;
		System.out.println(b2);
		
		byte b3 = 5, b4;
		b4 = (byte) (b3 + 3);
		System.out.println(b4);
		b4 = (byte) (b3 + 3.0);
		System.out.println(b4);
		
		String str = "True";
		System.out.println(str + 100);

//		byte b = Byte.parseByte(str);
//		System.out.println(b + 100);
//		Short s = Short.parseShort(str);
//		System.out.println(s + 100);
//		Integer i3 = Integer.parseInt(str);
//		System.out.println(i3 + 100);
//		Long l2 = Long.parseLong(str);
//		System.out.println(l2 + 100);
//		Float f = Float.parseFloat(str);
//		System.out.println(f + 100);
//		Double d = Double.parseDouble(str);
//		System.out.println(d + 100);
		
		boolean bl1 = Boolean.parseBoolean(str);
		System.out.println(bl1);
	}

}
