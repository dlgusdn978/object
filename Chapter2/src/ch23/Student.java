package ch23;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	};
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setSubjectScore(score);
		
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getSubjectScore();
			System.out.println(studentName + "학생의" + subject.getSubjectName() + "과목의 성적은" + subject.getSubjectScore() + "점이다.");
			
		}
		System.out.println("총점은 " + total + "점이다.");
	}

	
	
}
