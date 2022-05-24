package ch09;

public abstract class NoteBook extends Computer{

	@Override
	void display() {
		System.out.println("노트북");
		
	}
	//computer의 모든 메소드를 상속받지 않으려면 abstract로 선언하면 됨.
	
	

	
}
