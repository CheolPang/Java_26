package extend.poly;
//🌟🌟🌟🌟🌟다형성 : 사용방법은 동일하지만, 다양한 형태의 성질을 갖는 것!!🌟🌟🌟🌟🌟

class DrawData{
	private int height;
	private char outchar;
	
	public void Draw() {}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char getOutchar() {
		return outchar;
	}

	public void setOutchar(char outchar) {
		this.outchar = outchar;
	}
}
class IsoTriangle extends DrawData{
	@Override
	public void Draw() {
		for(int i=1; i<getHeight(); i++) {
			for(int j=0; j<i; j++) {
				System.out.print(getOutchar());
			}
			System.out.println();
		}
		System.out.println();
	}
}

class Pyramid extends DrawData{
	@Override
	public void Draw() {
		for(int i=1; i<getHeight(); i++) {
			for(int j=1; j<=getHeight()-i; j++) {
				System.out.print(" ");
			}
			for(int s=1; s<(2*i-1); s++) {
				System.out.print(getOutchar());
			}
			System.out.println();
		}
		System.out.println();
	}
	public void introPyramid() {
		System.out.println("나는 피라미드");
	}
}
public class Polymorphism{
	

	/*public static void main(String[] args) {
		IsoTriangle iT = new IsoTriangle();
		iT.setHeight(10);
		iT.setOutchar('#');
		iT.Draw();
		
		Pyramid p = new Pyramid();
		p.setHeight(10);
		p.setOutchar('#');
		p.Draw();
	
	}*/
	
	public static void main(String[] args) {
	// 다형성 구현으로 생성자 함수부분만 바꾸면 다양한 형태의 성질을 쉽게 변경 가능하다!!
	//	DrawData d = new IsoTriangle();
		DrawData d = new Pyramid();
		
		d.setHeight(10);
		d.setOutchar('#');
		d.Draw();
		System.out.println(d.toString());
//다형성 시 자식만 가지고 있는 메소드는 호출 안 됨!!
		//d.introPyramid();
	}
	
	
}
