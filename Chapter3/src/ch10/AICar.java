package ch10;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("알아서 자율주행.");
		System.out.println("방향전환 자유자재");
		
	}

	@Override
	public void stop() {
		System.out.println("장애물 발견 시 자동으로 주행 멈춤.");
	}
	

}
