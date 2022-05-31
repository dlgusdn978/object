package ch16;

public class PriorityAllocation implements Scheduler {
	public void getNextCall() {
		System.out.println("우선순위가 높은 고객을 숙련도 높은 상담원이 할당.");
	};
	public void sendCallToAgent(){
		System.out.println("다음 순서의 상담원에게 배분합니다.");
	};
}
