package ch09;

public abstract class Computer {

	abstract void display();
	abstract void typing();
	
	void turnOn() {
		System.out.println("���� �մϴ�.");
	}
	void turnOff() {
		System.out.println("���� ����.");
	}
	//�������� ����� �޼ҵ常 �����ϰ�, Ŭ���� ������ �������� ���� �޼ҵ�� �߻� �޼ҵ�� ����
	//���� Ŭ�������� ����. 
}
