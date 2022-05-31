package ch16;

public interface Scheduler {

	default void getNextCall(){};
	default void sendCallToAgent(){};
}
