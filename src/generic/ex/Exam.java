package generic.ex;

public class Exam {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		product.setKind(new Tv());
		Tv tv = new Tv();
		System.out.println(tv.name+" 제품이 필요함을 확인함.");
		product.setModel("스마트 티비");
		product.setCompany("삼성");
		
		Storage<Tv> storage = new StorageImpl<Tv>(10);
		storage.add(new Tv(), 9);
		int num = storage.get(new Tv(), 5);
		System.out.println(num+"번째 구매목록 확인함");
	}
}
