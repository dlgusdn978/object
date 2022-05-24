package ch09;

public class Desktop extends Computer{

	@Override
	void display() {
		System.out.println("화면 띄우기");
		
	}

	@Override
	void typing() {
		System.out.println("타이핑");
		
	}

	@Override
	void turnOff() {
		System.out.println("종료");
		//하위에서 재정의 가능.
	}

}
