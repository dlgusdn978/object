package ch09;

public abstract class Computer {

	abstract void display();
	abstract void typing();
	
	void turnOn() {
		System.out.println("전원 켭니다.");
	}
	void turnOff() {
		System.out.println("전원 끈다.");
	}
	//공통으로 사용할 메소드만 구현하고, 클래스 내에서 구현하지 않을 메소드는 추상 메소드로 놓고
	//하위 클래스에서 구현. 
}
