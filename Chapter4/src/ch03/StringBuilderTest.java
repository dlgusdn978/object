package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		//문자열 연결이나 변경 시 좋음.
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));

		String test = buffer.toString();
		System.out.println(test);
	}

}
