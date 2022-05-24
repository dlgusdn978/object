package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ� �Ǵ�.");
	}
	public void turnOff() {
		System.out.println("�õ� ����.");
	}
	public void washCar() {} //�����س��� ����. �ʿ��� ��쿡 ���� Ŭ�������� �������ؼ� ����� �� �ְԲ�.
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	//run�̶�� �帧(�ó�����) ���� ��
	//�� �޼ҵ��� ����� ���� Ŭ�������� ����.
	//�ó������� ���ϸ� �ȵǱ⶧���� final�� ����
}
