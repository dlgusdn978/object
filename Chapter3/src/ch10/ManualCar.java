package ch10;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("����� ������ ��.");	
		System.out.println("�ڵ� �����ؼ� ��ȸ�� ��ȸ��.");
		
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �߽߰� �극��ũ ����.");
		
	}

}
