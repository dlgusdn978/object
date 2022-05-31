package ch16;

public abstract class PlayerLevel {
	
	int count;
	abstract void run();
	abstract void jump();
	abstract void turn();
	abstract int showLevelMessage();
	
	void go(int count) {
		run();
		for(int i=0; i<count;i++) {
			jump();
		}
		turn();
		
	}
	public void getLevel() {
		count = showLevelMessage();
	}
	public void upgradeLevel(PlayerLevel level) {
		
	}
	public void play() {
		go(count);
		count++;
	}

}
