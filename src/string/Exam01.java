package string;

class Thing extends Object {
	private String name;
	private int count;
	
	Thing(String name){
		this.name = name;
	}
	
	public Thing() {
		
	}

	void print() {
		System.out.println("name : "+ name + "cou1nt : " + count);

	}
	
}

public class Exam01 {
	public static void main(String[] args) {
		String th1 = "desk";
		String th2 = "desk";
		
		System.out.println(th1 + ":" + "th2");
		System.out.println(th1==th2);
		System.out.println(th1.equals(th2));
		
		String th3 = new String("desk");
		String th4 = new String("desk");
		
		System.out.println("=============");
		System.out.println(th3+":"+ th4);
		System.out.println(th3==th4);
		th3.equals(th4);
		
		String th5 = new String("desk");
		String th6 = new String("desk");
		
		System.out.println("=============");
		System.out.println(th5+":"+ th6);
		System.out.println(th5==th6);
		th3.equals(th5==th6);
		
		
	}
}
