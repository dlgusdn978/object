package ch06;

public class ThreeDPrinter1 {
	private Powder material;
	//��ü�� object�� ������ �� ������?
	//����� ��½� type casting�� �ʿ��ϴ�. ����.
	//�׷��� generic ���
	public Powder getMaterial() {
		return material;
	}

	public void setMaterial(Powder material) {
		this.material = material;
	}
	
	public String toString() {
		return "���� powderf";
	}
}
