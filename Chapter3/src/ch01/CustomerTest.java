package ch01;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(12345678, "�̼���");
		customerLee.bonusPoint = 100;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(12345679, "������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//���� Ŭ������ ������ �����ϰ� ���� Ŭ������ �����ڷ� �ν��Ͻ��� ������ �� �ִ�.(��ĳ����)
		//���� Ŭ������ �޼ҵ常 ����� �� ����. ������ Ÿ���� ���� (Customer)
		//but, �޼ҵ� ����� ��� ���� ���� Ŭ���� �޼ҵ� ������ ���� - overriding(�޼ҵ� �̸��� ���� ������ �ٸ�)
		//�ϳ��� �ν��Ͻ��� ��� ���ϰ� �����ϱ� ���� ��ĳ���� ���. ex) �迭 ���
		
		Customer vip = new VIPCustomer(12345680, "noname");
		Customer silver = new Customer(12345681, "silver");
		Customer vip2 = new VIPCustomer(12345682, "vip");
		Customer[] arr = {vip, silver, vip2};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getCustomerName());
			System.out.println(arr[i].customerGrade);
			System.out.println(arr[i].bonusRatio);
			System.out.println();
		}
		//���� ����� iron, bronze, silver, gold, platinum, diamond, master, grandmaster, challenger�� �ִٰ� ġ��.
		// IronCustomer iron = new IronCustomer(); ~ ChallengerCustomer challenger = new ChallengerCustomer();���� ������ �ϰԵǸ�
		// �⺻���̰� �������� �������� Ŭ���� ���ο� �Ȱ��� ����������Ѵ�. 
		// �̸�, ����, ���̵�, ���� Ƚ�� ���.. �����ؾ��� ����� ���������� iron ~ challenger���� �� 9�� Ŭ���� �ȿ� �Ȱ��� ������ �ݺ������� ������ �� �ۿ� ����.(�ϵ��ڵ�)
		// Customer��� �θ� Ŭ������ ���� �̸�, ���� �� �⺻���̰� �������� ������ �ۼ��ϰ�  �� ��޺� �� Ŭ������ �� ĳ�����Ͽ� �ݺ����� ������ �ϵ� �ڵ����� �ʰ�, �ѹ��� �Է����ε� �����ϰ�.
		// ���� �ٸ��� ������.. ��޺� ���η��̳� ����Ʈ ������ �� �������� ������ iron ~ challenger Ŭ���� ������ �����ϰ�, ������ ������ customer�� �ٿ� ĳ�����Ͽ� ����ϸ� ��.
		// Customer vip = new VIPCustomer(12345680, "noname"); <- �� ĳ����
		// VIPCustomer vip1 = (VIPCustomer) vip; <- �� ĳ������ ��ü�� �ٿ� ĳ���� 
		
		
	}
}
