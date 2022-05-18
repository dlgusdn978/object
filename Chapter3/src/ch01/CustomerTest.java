package ch01;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(12345678, "이순신");
		customerLee.bonusPoint = 100;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(12345679, "김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성할 수 있다.(업캐스팅)
		//상위 클래스의 메소드만 사용할 수 있음. 변수는 타입을 따라감 (Customer)
		//but, 메소드 연산과 결과 값은 하위 클래스 메소드 내용을 따라감 - overriding(메소드 이름만 같고 내용은 다름)
		//하나의 인스턴스로 묶어서 편하게 관리하기 위해 업캐스팅 사용. ex) 배열 사용
		
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
		//고객의 등급이 iron, bronze, silver, gold, platinum, diamond, master, grandmaster, challenger가 있다고 치자.
		// IronCustomer iron = new IronCustomer(); ~ ChallengerCustomer challenger = new ChallengerCustomer();까지 선언을 하게되면
		// 기본적이고 공통적인 내용조차 클래스 내부에 똑같이 구현해줘야한다. 
		// 이름, 나이, 아이디, 구매 횟수 등등.. 구현해야할 대상이 많아질수록 iron ~ challenger까지 총 9개 클래스 안에 똑같은 내용을 반복적으로 구현할 수 밖에 없음.(하드코딩)
		// Customer라는 부모 클래스를 만들어서 이름, 나이 등 기본적이고 공통적인 내용을 작성하고  각 등급별 고객 클래스를 업 캐스팅하여 반복적인 내용을 하드 코딩하지 않고, 한번의 입력으로도 가능하게.
		// 값을 다르게 지정할.. 등급별 할인률이나 포인트 적립률 등 세부적인 내용은 iron ~ challenger 클래스 내에서 구현하고, 기존에 선언한 customer를 다운 캐스팅하여 사용하면 됨.
		// Customer vip = new VIPCustomer(12345680, "noname"); <- 업 캐스팅
		// VIPCustomer vip1 = (VIPCustomer) vip; <- 업 캐스팅한 객체를 다운 캐스팅 
		
		
	}
}
