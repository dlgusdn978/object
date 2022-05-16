package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudentName("±èÃ¶¼ö");
		student.studentID = 12345;
		student.address = "¼­¿ï °­³²±¸";
		
		student.showStudentInfo();
		System.out.println(student.getStudentName());
		
		Student studentKim = new Student();
		studentKim.studentID = 432;
		studentKim.setStudentName("±èÁøÈ­");
		studentKim.address = "¼º³²½Ã";
		
		studentKim.showStudentInfo();
	}
}
