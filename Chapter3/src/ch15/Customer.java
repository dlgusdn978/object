package ch15;

public class Customer implements Buy, Sell {
	//buy, sell�� ��ӹ޾� override�ؼ�
	//customer �� �޼ҵ� ���·� ���.
	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
		
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}

	public void hello() {
		System.out.println("hello");
	}
}
