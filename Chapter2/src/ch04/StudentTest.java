package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudentName("��ö��");
		student.studentID = 12345;
		student.address = "���� ������";
		
		student.showStudentInfo();
		System.out.println(student.getStudentName());
		
		Student studentKim = new Student();
		studentKim.studentID = 432;
		studentKim.setStudentName("����ȭ");
		studentKim.address = "������";
		
		studentKim.showStudentInfo();
	}
}
