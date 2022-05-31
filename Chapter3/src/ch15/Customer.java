package ch15;

public class Customer implements Buy, Sell {
	//buy, sell을 상속받아 override해서
	//customer 내 메소드 형태로 출력.
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
