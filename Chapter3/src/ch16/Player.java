package ch16;

public class Player {

	public static void main(String[] args) {
		PlayerLevel level = new BeginnerLevel();
		level.getLevel();
		level.upgradeLevel(level);
		level.play();
		
		level = new AdvancedLevel();
		level.getLevel();
		level.upgradeLevel(level);
		level.play();
		
		level = new SuperLevel();
		level.getLevel();
		level.upgradeLevel(level);
		level.play();
	}
}
