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
			System.out.println(studentName + "�л���" + subject.getSubjectName() + "������ ������" + subject.getSubjectScore() + "���̴�.");
			
		}
		System.out.println("������ " + total + "���̴�.");
	}

	
	
}
