package stream.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//객체를 직렬화해서 파일에 저장
public class SerializableWriter {
	public static void main(String[] args) throws IOException {
		 FileOutputStream fos = new FileOutputStream("src/object.dat");
		 ObjectOutputStream oos = new ObjectOutputStream(fos);
		 
		 ClassA classA = new ClassA();
		 classA.field1=1;
		 classA.field2.filed1=2;
		 classA.field3=3;
		 classA.field4=4;
		 oos.writeObject(classA);
		 oos.flush();
		 oos.close();
		 fos.close();
		 System.out.println("==파일 직렬화해서 파일에 저장완료==");
	}
}
