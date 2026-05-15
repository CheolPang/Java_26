package classes;

public class MemberInfo {
	// 🌟X100 자바빈즈, DTO : 필드를 private으로 선언하고 외부에서 private으로 선언한 데이터를 얻어가기 위해 getter와
	// 데이터를 수정하기 위한 setter를 설정
	private String name;
	private int age;
	private String id;

	public MemberInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberInfo(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//오버라이딩
	@Override
	public String toString() {
		return "MemberInfo [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	

}
