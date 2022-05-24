package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동 건다.");
	}
	public void turnOff() {
		System.out.println("시동 끈다.");
	}
	public void washCar() {} //구현해놓지 않음. 필요한 경우에 하위 클래스에서 재정의해서 사용할 수 있게끔.
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	//run이라는 흐름(시나리오) 구성 후
	//각 메소드의 기능은 하위 클래스에서 구현.
	//시나리오는 변하면 안되기때문에 final로 선언
}
