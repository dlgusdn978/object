package ch16;

public  class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 불가능;;");
		
	}
	
	@Override
	public void turn() {
		System.out.println("turn 절대 불가능;;;");
		
	}

	@Override
	public int showLevelMessage(){
		System.out.println("******초급자 레벨입니다.******");
		return 1;
	}

	

	
	

}
