package ch23;

public class StudentSubjectTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showScoreInfo();
		System.out.println("------------------------");
		studentKim.showScoreInfo();
		System.out.println();
	}
	//main 부분은 값을 입력, 출력하는 부분과 함수를 호출하는 것만 작성.
}
