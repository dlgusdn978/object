package ch04;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID +"�й� �л��� �̸��� " + studentName + "�̰�, �ּҴ� " + address + "�̴�.");
	}
}
