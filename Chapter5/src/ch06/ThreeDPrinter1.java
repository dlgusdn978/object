package ch06;

public class ThreeDPrinter1 {
	private Powder material;
	//객체를 object로 선언할 때 문제점?
	//결과값 출력시 type casting이 필요하다. 불편.
	//그래서 generic 사용
	public Powder getMaterial() {
		return material;
	}

	public void setMaterial(Powder material) {
		this.material = material;
	}
	
	public String toString() {
		return "재료는 powderf";
	}
}
