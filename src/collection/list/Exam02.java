package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam02 {
	public static void main(String[] args) {
		List<String> alist = new ArrayList<String>();
		List<String> llist = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i =0; i<10000; i++) {
			alist.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList를 사용하여 걸린시간: "+(endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i =0; i<10000; i++) {
			llist.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList를 사용하여 걸린시간: "+(endTime-startTime)+"ns");
		
		
	}
}
