package ch16;

public  class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("jump �Ұ���;;");
		
	}
	
	@Override
	public void turn() {
		System.out.println("turn ���� �Ұ���;;;");
		
	}

	@Override
	public int showLevelMessage(){
		System.out.println("******�ʱ��� �����Դϴ�.******");
		return 1;
	}

	

	
	

}
