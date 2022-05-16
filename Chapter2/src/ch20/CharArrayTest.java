package ch20;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		//배열의 각 공간에 문자열 넣음
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		//character type의 alpha 변수를 선언하고 alphabets 배열의 요소 수만큼 반복문
		for(char alpha : alphabets) {
			System.out.println( alpha + ", "+ (int) alpha);
		}
	}
}
