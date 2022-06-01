package ch03;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		//문자열끼리 합쳐서 새로운 문자열을 만들 수 있으나/
		//새로운 문자열은 새로운 공간에 할당됨.
		//문제 해결을 위해 stringbuilder 사용.
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); 
	}

}
