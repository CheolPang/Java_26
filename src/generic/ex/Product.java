package generic.ex;

class Tv{
	String name = "TV";
}
public class Product<T, M>{
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
		System.out.println(model+" 모델로 선택 완료");
	}
	
	
}
