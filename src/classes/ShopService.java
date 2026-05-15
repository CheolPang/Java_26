package classes;

public class ShopService {
	//싱글톤 객체를 만드는 방법
	private static ShopService singleton = new ShopService();
	
	//외부에서는 생성자 함수로 객체를 만들 수 없도록 생성자 함수에 private을 붙인다.
	private ShopService() {};
	
	//정적 메소드
	static ShopService getInstance() {
		return singleton;
	}
}
