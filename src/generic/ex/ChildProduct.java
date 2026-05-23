package generic.ex;

public class ChildProduct<T, M, C> extends Product<T, M>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
		System.out.println(company +" 제품으로 구매결정");
	}
	
}
