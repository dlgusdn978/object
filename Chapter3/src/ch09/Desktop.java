package ch09;

public class Desktop extends Computer{

	@Override
	void display() {
		System.out.println("ȭ�� ����");
		
	}

	@Override
	void typing() {
		System.out.println("Ÿ����");
		
	}

	@Override
	void turnOff() {
		System.out.println("����");
		//�������� ������ ����.
	}

}
