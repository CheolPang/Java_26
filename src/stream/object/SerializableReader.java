package stream.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class SerializableReader implements Serializable{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("src/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA a = (ClassA) ois.readObject();
		System.out.println(a.field1);
		System.out.println(a.field2);
		System.out.println(a.field3);
		System.out.println(a.field4);
	}
}
