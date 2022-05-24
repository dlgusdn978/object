package ch10;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전할 거.");	
		System.out.println("핸들 조작해서 좌회전 우회전.");
		
	}

	@Override
	public void stop() {
		System.out.println("장애물 발견시 브레이크 밟음.");
		
	}

}
