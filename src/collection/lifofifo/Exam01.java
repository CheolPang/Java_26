package collection.lifofifo;

import java.util.Stack;

public class Exam01 {
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		//LIFO: Last Input First Out
		stk.push(30);
		stk.push(80);
		stk.push(10);
		stk.push(10);
		
		System.out.println(stk);
		int data = stk.pop();
		System.out.println(data);
		System.out.println(stk);
		int data2 = stk.peek();
		System.out.println(data2);
		System.out.println(stk);
		
		stk.push(100);
		System.out.println(stk);
		while(!stk.empty()) System.out.println(stk.pop());
		System.out.println(stk);
	}
}
