package ch16;

public class PriorityAllocation implements Scheduler {
	public void getNextCall() {
		System.out.println("�켱������ ���� ���� ���õ� ���� ������ �Ҵ�.");
	};
	public void sendCallToAgent(){
		System.out.println("���� ������ �������� ����մϴ�.");
	};
}
