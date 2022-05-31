package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(100, "Lee");
		Student s2 = new Student(100, "Lee");
		Student s3 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		Student copyStudent = (Student) s1.clone();
		s1.setStudentName("kim");
		Student copyStudent2 = (Student) s1.clone();
		
		System.out.println(copyStudent);
		System.out.println(copyStudent2);
	}
}
